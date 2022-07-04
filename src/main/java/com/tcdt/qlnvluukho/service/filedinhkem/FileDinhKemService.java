package com.tcdt.qlnvluukho.service.filedinhkem;


import com.tcdt.qlnvluukho.request.object.FileDinhKemReq;
import com.tcdt.qlnvluukho.table.FileDinhKem;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

public interface FileDinhKemService {

    @Transactional(rollbackOn = Exception.class)
    List<FileDinhKem> saveListFileDinhKem(List<FileDinhKemReq> fileDinhKemReqs,
                                          Long dataId,
                                          String dataType);

    List<FileDinhKem> search(Long dataId, Collection<String> dataTypes);

    void delete(Long dataId, Collection<String> dataTypes);

    void saveFileDinhKems(Collection<FileDinhKem> fileDinhKems);

    void deleteMultiple(Collection<Long> dataIds, Collection<String> dataTypes);
}
