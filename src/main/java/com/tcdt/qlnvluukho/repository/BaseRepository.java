package com.tcdt.qlnvluukho.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepository<E,PK extends Serializable> extends PagingAndSortingRepository<E,PK>,JpaSpecificationExecutor<E> {
	List<E> findAll();

	Integer findMaxSoBienBan(String maDvi, Integer nam);

	Integer findMaxSoPhieu(String maDvi, Integer nam);
}