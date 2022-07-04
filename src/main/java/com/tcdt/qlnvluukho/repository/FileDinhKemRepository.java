package com.tcdt.qlnvluukho.repository;

import com.tcdt.qlnvluukho.table.FileDinhKem;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Repository
public interface FileDinhKemRepository extends CrudRepository<FileDinhKem, Long> {

	List<FileDinhKem> findByDataIdAndDataTypeIn(Long dataId, Collection<String> dataTypes);

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM FILE_DINH_KEM u WHERE u.ID in ?1", nativeQuery = true)
	int deleteWithIds(List<Long> ids);

	@Transactional
	@Modifying
	int deleteByDataIdAndDataTypeIn(Long dataId, Collection<String> dataTypes);

	@Transactional
	@Modifying
	int deleteByDataIdInAndDataTypeIn(Collection<Long> dataIds, Collection<String> dataTypes);
}
