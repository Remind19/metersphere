package io.metersphere.api.dto.definition.parse;

import io.metersphere.base.domain.ApiDefinitionWithBLOBs;
import io.metersphere.base.domain.ApiTestCaseWithBLOBs;
import lombok.Data;

import java.util.List;

@Data
public class ApiDefinitionImport {
    private String projectName;
    private String protocol;
    private List<ApiDefinitionWithBLOBs> data;

    // 新版本带用例导出
    private List<ApiTestCaseWithBLOBs> cases;
}
