---
title: 預設上傳
id: preset-place/upload
tags: [preset-place, upload]
---

# 預設上傳

![](bws:trainsystemutilities:wiki/screens/preset-place-upload__ja_jp.png)

用於請求將自己的預設發佈到 Preset Place 的對話框。

[[TOC]]

## 打開 {#open}

首先，你需要將要發佈的列車在本地保存為[列車預設](../train-preset-tool/browse.md)。

1. 在 **GUI 模式**下**右鍵**[列車預設工具](../train-preset-tool/browse.md)，打開瀏覽界面（用 **Alt + 滾輪**切換模式）。
2. 將模式設為 **`Mine`（你的）**。
3. **左鍵**你想發佈的預設卡片上的**上傳圖標**，打開此對話框。

> [!NOTE]
> 上傳圖標僅在你自己的、已完成 Microsoft 賬號關聯、且並非從 Preset Place 下載的預設上顯示。

## 上傳項目

| 項目 | 概要 |
|---|---|
| 圖片（最多 5 張） | 用於預覽的 PNG / JPG。用 + 按鈕添加 |
| Markdown 説明 | 4096 字符。支持換行 / 粘貼 / 複製 / Ctrl+Enter |
| 發佈按鈕 | 輸入校驗通過後提交發布請求 |

## 説明編輯器

多行 Markdown 編輯。可使用 `Preview` 切換查看渲染結果：

- 標題 / 列表 / 鏈接 / 強調 / 引用等標準 Markdown
- Ctrl + Enter 執行 `Publish`

## 發佈流程

1. 至少 1 張圖片 + 至少 1 字符説明後，`Publish` 即可用
2. 發佈確認對話框
3. 客户端將其發送到 Preset Place 服務器
4. 審核通過後上線（= 自動或版主審核）

## 認證

發佈需要 Microsoft 賬號認證。
可在[創作者中心](creator-center.md)查看認證狀態 / 重新認證。

## 相關

- [Preset Place 概述](overview.md)
- [預設詳情](detail.md)
- [創作者中心](creator-center.md)
- [列車預設瀏覽](../train-preset-tool/browse.md)
