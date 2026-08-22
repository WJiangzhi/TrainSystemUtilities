---
title: 预设上传
id: preset-place/upload
tags: [preset-place, upload]
---

# 预设上传

![](bws:trainsystemutilities:wiki/screens/preset-place-upload__ja_jp.png)

用于请求将自己的预设发布到 Preset Place 的对话框。

[[TOC]]

## 打开 {#open}

首先，你需要将要发布的列车在本地保存为[列车预设](../train-preset-tool/browse.md)。

1. 在 **GUI 模式**下**右键**[列车预设工具](../train-preset-tool/browse.md)，打开浏览界面（用 **Alt + 滚轮**切换模式）。
2. 将模式设为 **`Mine`（你的）**。
3. **左键**你想发布的预设卡片上的**上传图标**，打开此对话框。

> [!NOTE]
> 上传图标仅在你自己的、已完成 Microsoft 账号关联、且并非从 Preset Place 下载的预设上显示。

## 上传项目

| 项目 | 概要 |
|---|---|
| 图片（最多 5 张） | 用于预览的 PNG / JPG。用 + 按钮添加 |
| Markdown 说明 | 4096 字符。支持换行 / 粘贴 / 复制 / Ctrl+Enter |
| 发布按钮 | 输入校验通过后提交发布请求 |

## 说明编辑器

多行 Markdown 编辑。可使用 `Preview` 切换查看渲染结果：

- 标题 / 列表 / 链接 / 强调 / 引用等标准 Markdown
- Ctrl + Enter 执行 `Publish`

## 发布流程

1. 至少 1 张图片 + 至少 1 字符说明后，`Publish` 即可用
2. 发布确认对话框
3. 客户端将其发送到 Preset Place 服务器
4. 审核通过后上线（= 自动或版主审核）

## 认证

发布需要 Microsoft 账号认证。
可在[创作者中心](creator-center.md)查看认证状态 / 重新认证。

## 相关

- [Preset Place 概述](overview.md)
- [预设详情](detail.md)
- [创作者中心](creator-center.md)
- [列车预设浏览](../train-preset-tool/browse.md)
