package com.zuoye.yeaicodemother.core.saver;

import cn.hutool.core.util.StrUtil;
import com.zuoye.yeaicodemother.ai.model.HtmlCodeResult;
import com.zuoye.yeaicodemother.exception.BusinessException;
import com.zuoye.yeaicodemother.exception.ErrorCode;
import com.zuoye.yeaicodemother.model.enums.CodeGenTypeEnum;

/**
 * @ClassName: HtmlCodeFileSaverTemplate
 * @description: HTML 代码文件保存器
 * @author: zhangjy
 * @create: 2025.11.21 16:24
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult> {

    @Override
    protected CodeGenTypeEnum getCodeType() {
        return CodeGenTypeEnum.HTML;
    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        // 保存 HTML 文件
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
    }

    @Override
    protected void validateInput(HtmlCodeResult result) {
        super.validateInput(result);
        // HTML 代码不能为空
        if (StrUtil.isBlank(result.getHtmlCode())) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML代码内容不能为空");
        }
    }
}
