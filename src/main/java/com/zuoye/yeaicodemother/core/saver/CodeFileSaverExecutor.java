package com.zuoye.yeaicodemother.core.saver;

import com.zuoye.yeaicodemother.ai.model.HtmlCodeResult;
import com.zuoye.yeaicodemother.ai.model.MultiFileCodeResult;
import com.zuoye.yeaicodemother.exception.BusinessException;
import com.zuoye.yeaicodemother.exception.ErrorCode;
import com.zuoye.yeaicodemother.model.enums.CodeGenTypeEnum;

import java.io.File;

/**
 * @ClassName: CodeFileSaverExecutor
 * @description: 代码文件保存执行器 根据代码生成类型执行相应的保存逻辑
 * @author: zhangjy
 * @create: 2025.11.21 16:52
 */
public class CodeFileSaverExecutor {

    private static final HtmlCodeFileSaverTemplate htmlCodeFileSaverTemplate = new HtmlCodeFileSaverTemplate();

    private static final MultiFileCodeFileSaverTemplate multiFileCodeFileSaverTemplate = new MultiFileCodeFileSaverTemplate();

    /**
     * 执行代码保存 （使用 appId）
     *
     * @param object          代码结果对象
     * @param codeGenTypeEnum 代码生成类型
     * @param appId          应用 ID
     * @return 保存的目录
     */
    public static File executeSaver(Object object, CodeGenTypeEnum codeGenTypeEnum, Long appId) {
        return switch (codeGenTypeEnum) {
            case HTML -> htmlCodeFileSaverTemplate.saveCode((HtmlCodeResult) object, appId);
            case MULTI_FILE -> multiFileCodeFileSaverTemplate.saveCode((MultiFileCodeResult) object, appId);
            default -> throw new BusinessException(ErrorCode.SYSTEM_ERROR, "不支持的代码生成类型" + codeGenTypeEnum);
        };
    }
}
