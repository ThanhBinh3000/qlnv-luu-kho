package com.tcdt.qlnvluukho.repository.khotang;

import com.tcdt.qlnvluukho.table.khotang.KtNganLo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface KtNganLoRepository extends CrudRepository<KtNganLo, Long>, KtNganLoRepositoryCustom {

    KtNganLo findFirstByMaNganlo(String maNganLo);

    List<KtNganLo> findByMaNganloIn(Collection<String> mas);
}
