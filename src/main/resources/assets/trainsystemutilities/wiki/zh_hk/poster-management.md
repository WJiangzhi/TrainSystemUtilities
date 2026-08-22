---
title: 海報管理方塊
id: poster-management
tags: [poster, block, display]
---

# 海報管理方塊

![](bws:trainsystemutilities:wiki/screens/poster-management__ja_jp.png)

以輪播方式顯示 PNG / JPG 圖片的廣告板。  
將其放置在車站或站廳，可用於顯示導引海報、運營信息、廣告等。

[[TOC]]

## 如何打開

1. 放置**海報管理方塊**（可像普通方塊一樣放置在地上、牆上等）。
2. 對已放置的方塊**右鍵**打開 GUI。
3. 第一個右鍵它的人成為**所有者**。當右下角臉形圖標設為**私有**時，除所有者外無人能打開它（[訪問模式](getting-started.md#access-mode)）。

## 操作（點擊 / 滾動位置）

GUI 內的全部操作都通過**鼠標**完成。

| 想做的事 | 操作方法 |
|---|---|
| 添加圖片 | **點擊「📂 選擇文件」按鈕** → 在系統文件選擇器中選取 PNG / JPG |
| 開啓 / 關閉某張圖片的顯示 | **點擊列表中該圖片所在行**（行右端按鈕以外的部分） |
| 更改圖片顯示順序 | **點擊每行右端的上 / 下按鈕** |
| 刪除圖片 | **點擊每行右端的刪除按鈕** |
| 滾動列表 | 在圖片列表上**滾動鼠標滾輪**（圖片達到 6 張及以上時） |
| 適配顯示器（FIT/COVER） | **點擊「適配顯示器」開關** |
| 用單張圖片做動畫 | **點擊「僅單張動畫」開關** |
| 開啓 / 關閉顯示器鏈接 | **點擊顯示器開關** |
| 打開動畫設置 | **點擊「♫ 動畫」按鈕** → 彈出[動畫設置](poster-management/animation.md) |
| 切換私有 / 公開 | **點擊右下角的臉形圖標** |

## 能做的事

| 功能 | 説明 |
|---|---|
| 圖片註冊 | 從 URL 獲取 PNG / JPG 圖片並內部存儲 |
| 排序 | 通過列表中的交換來重新排序（帶動畫） |
| 自動 / 單張切換 | 輪播或單圖顯示 |
| FIT / COVER | 圖片在框內的適配方式（裁剪或留邊） |
| 顯示器鏈接 | 通過[顯示器連接卡](tools/monitor-link-card.md)在已鏈接的顯示器上顯示 |
| 動畫設置 | 滑動方向 / 速度 / 效果（詳見[動畫](poster-management/animation.md)） |

## GUI 主要元素

| 元素 | 功能 |
|---|---|
| `Fit to monitor` 開關 | 開啓 = FIT，關閉 = COVER |
| `Animate single only` 開關 | 開啓 = 單張，關閉 = 輪播 |
| 已註冊圖片列表 | 上下滾動；逐行顯示開關 + 交換操作 |
| 顯示器離線開關 | 啓用顯示器鏈接 |
| `Animation` 按鈕 | 在彈出窗口中設置動畫（[動畫](poster-management/animation.md)） |
| 物品欄 | 玩家物品欄 |
| 所有者臉形圖標 | 私有 / 公開切換 |

## 圖片註冊

按下**「📂 選擇文件」按鈕**後，會打開你電腦的文件選擇對話框。在此選擇**一張 PNG / JPG / JPEG 圖片**，該圖片即被註冊到此方塊並加入列表。已註冊的圖片保存在服務器端，也會作為輪播顯示在顯示器上。

> [!NOTE]
> 每個文件大小限制為 5MB。過大的圖片會報錯。

## 顯示器鏈接

```
[Poster Management Block] ─── [Monitor Link Card] ─── [Monitor Block × N]
```

- 用存儲卡等鏈接海報管理方塊。
- 已鏈接的顯示器上會播放輪播。
- 一個海報方塊 → 多個顯示器也可以。
- 詳情：[顯示器連接卡](tools/monitor-link-card.md)

## 相關

- [動畫設置](poster-management/animation.md)
- [顯示器連接卡](tools/monitor-link-card.md)
- [存儲卡](tools/memory-card.md)
- [管理用計算機顯示器](management-computer/monitor.md)
