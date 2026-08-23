---
title: 預設上傳
id: preset-place/upload
tags: [preset-place, upload]
---

# 預設上傳

![](bws:trainsystemutilities:wiki/screens/preset-place-upload__ja_jp.png)

用於請求將自己的預設釋出到 Preset Place 的對話方塊。

[[TOC]]

## 開啟 {#open}

首先，你需要將要釋出的列車在本地儲存為[列車預設](../train-preset-tool/browse.md)。

1. 在 **GUI 模式**下**右鍵**[列車預設工具](../train-preset-tool/browse.md)，開啟瀏覽介面（用 **Alt + 滾輪**切換模式）。
2. 將模式設為 **`Mine`（你的）**。
3. **左鍵**你想釋出的預設卡片上的**上傳圖示**，開啟此對話方塊。

> [!NOTE]
> 上傳圖示僅在你自己的、已完成 Microsoft 賬號關聯、且並非從 Preset Place 下載的預設上顯示。

## 上傳專案

| 專案 | 概要 |
|---|---|
| 圖片（最多 5 張） | 用於預覽的 PNG / JPG。用 + 按鈕新增 |
| Markdown 說明 | 4096 字元。支援換行 / 貼上 / 複製 / Ctrl+Enter |
| 釋出按鈕 | 輸入校驗透過後提交發布請求 |

## 說明編輯器

多行 Markdown 編輯。可使用 `Preview` 切換檢視渲染結果：

- 標題 / 列表 / 連結 / 強調 / 引用等標準 Markdown
- Ctrl + Enter 執行 `Publish`

## 釋出流程

1. 至少 1 張圖片 + 至少 1 字元說明後，`Publish` 即可用
2. 釋出確認對話方塊
3. 客戶端將其傳送到 Preset Place 伺服器
4. 稽核透過後上線（= 自動或版主稽核）

## 認證

釋出需要 Microsoft 賬號認證。
可在[創作者中心](creator-center.md)檢視認證狀態 / 重新認證。

## 相關

- [Preset Place 概述](overview.md)
- [預設詳情](detail.md)
- [創作者中心](creator-center.md)
- [列車預設瀏覽](../train-preset-tool/browse.md)
