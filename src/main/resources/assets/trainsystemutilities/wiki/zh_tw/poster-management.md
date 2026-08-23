---
title: 海報管理方塊
id: poster-management
tags: [poster, block, display]
---

# 海報管理方塊

![](bws:trainsystemutilities:wiki/screens/poster-management__ja_jp.png)

以輪播方式顯示 PNG / JPG 圖片的廣告板。  
將其放置在車站或站廳，可用於顯示導引海報、運營資訊、廣告等。

[[TOC]]

## 如何開啟

1. 放置**海報管理方塊**（可像普通方塊一樣放置在地上、牆上等）。
2. 對已放置的方塊**右鍵**開啟 GUI。
3. 第一個右鍵它的人成為**所有者**。當右下角臉形圖示設為**私有**時，除所有者外無人能開啟它（[訪問模式](getting-started.md#access-mode)）。

## 操作（點選 / 滾動位置）

GUI 內的全部操作都透過**滑鼠**完成。

| 想做的事 | 操作方法 |
|---|---|
| 新增圖片 | **點選「📂 選擇檔案」按鈕** → 在系統檔案選擇器中選取 PNG / JPG |
| 開啟 / 關閉某張圖片的顯示 | **點選列表中該圖片所在行**（行右端按鈕以外的部分） |
| 更改圖片顯示順序 | **點選每行右端的上 / 下按鈕** |
| 刪除圖片 | **點選每行右端的刪除按鈕** |
| 滾動列表 | 在圖片列表上**滾動滑鼠滾輪**（圖片達到 6 張及以上時） |
| 適配顯示器（FIT/COVER） | **點選「適配顯示器」開關** |
| 用單張圖片做動畫 | **點選「僅單張動畫」開關** |
| 開啟 / 關閉顯示器連結 | **點選顯示器開關** |
| 開啟動畫設定 | **點選「♫ 動畫」按鈕** → 彈出[動畫設定](poster-management/animation.md) |
| 切換私有 / 公開 | **點選右下角的臉形圖示** |

## 能做的事

| 功能 | 說明 |
|---|---|
| 圖片註冊 | 從 URL 獲取 PNG / JPG 圖片並內部儲存 |
| 排序 | 透過列表中的交換來重新排序（帶動畫） |
| 自動 / 單張切換 | 輪播或單圖顯示 |
| FIT / COVER | 圖片在框內的適配方式（裁剪或留邊） |
| 顯示器連結 | 透過[顯示器連線卡](tools/monitor-link-card.md)在已連結的顯示器上顯示 |
| 動畫設定 | 滑動方向 / 速度 / 效果（詳見[動畫](poster-management/animation.md)） |

## GUI 主要元素

| 元素 | 功能 |
|---|---|
| `Fit to monitor` 開關 | 開啟 = FIT，關閉 = COVER |
| `Animate single only` 開關 | 開啟 = 單張，關閉 = 輪播 |
| 已註冊圖片列表 | 上下滾動；逐行顯示開關 + 交換操作 |
| 顯示器離線開關 | 啟用顯示器連結 |
| `Animation` 按鈕 | 在彈出視窗中設定動畫（[動畫](poster-management/animation.md)） |
| 物品欄 | 玩家物品欄 |
| 所有者臉形圖示 | 私有 / 公開切換 |

## 圖片註冊

按下**「📂 選擇檔案」按鈕**後，會開啟你電腦的檔案選擇對話方塊。在此選擇**一張 PNG / JPG / JPEG 圖片**，該圖片即被註冊到此方塊並加入列表。已註冊的圖片儲存在伺服器端，也會作為輪播顯示在顯示器上。

> [!NOTE]
> 每個檔案大小限制為 5MB。過大的圖片會報錯。

## 顯示器連結

```
[Poster Management Block] ─── [Monitor Link Card] ─── [Monitor Block × N]
```

- 用儲存卡等連結海報管理方塊。
- 已連結的顯示器上會播放輪播。
- 一個海報方塊 → 多個顯示器也可以。
- 詳情：[顯示器連線卡](tools/monitor-link-card.md)

## 相關

- [動畫設定](poster-management/animation.md)
- [顯示器連線卡](tools/monitor-link-card.md)
- [儲存卡](tools/memory-card.md)
- [管理用計算機顯示器](management-computer/monitor.md)
