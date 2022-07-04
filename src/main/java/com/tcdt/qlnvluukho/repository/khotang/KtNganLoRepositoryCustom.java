package com.tcdt.qlnvluukho.repository.khotang;

import com.tcdt.qlnvluukho.table.khotang.KtNganLo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface KtNganLoRepositoryCustom {

    Page<KtNganLo> selectParams(@Param("ma") String ma, @Param("ten") String ten, @Param("id") Long id, Pageable pageable);
}
