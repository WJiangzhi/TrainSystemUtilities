---
title: 鐵路管理方塊
id: railway-management
tags: [station, display, block]
---

# 鐵路管理方塊

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

放置在車站月台上的顯示板方塊。它會自動顯示已停靠 / 即將到站的列車，並可與顯示器、顏色設置和廣播（SAS）整合。

[[TOC]]

## 如何打開

1. 將**鐵路管理方塊**放置在車站月台上。和 Create 的車站方塊一樣，通過**右鍵已鋪設的軌道**將其放置到軌道上。
2. 對已放置的方塊**右鍵**打開 GUI。
3. 顯示哪個車站，需用[存儲卡](tools/memory-card.md)將此方塊與[管理用計算機](management-computer/overview.md)鏈接後決定。
4. 第一個右鍵它的人成為**所有者**。當右下角臉形圖標設為**私有**時，除所有者外無人能打開它（[訪問模式](getting-started.md#access-mode)）。

> [!NOTE]
> 本方塊和 Create 的車站一樣是「放置在軌道上」的，不能放在空地上。請先鋪設軌道，再右鍵該軌道。

## 操作（點擊 / 滾動位置）

GUI 內的全部操作都通過**鼠標**完成（無需鍵盤）。

| 想做的事 | 操作方法 |
|---|---|
| 開啓 / 關閉顯示器 | **點擊顯示器所在行的開關** |
| 打開顯示器設置 | **點擊顯示器行的「⚙ 設置」按鈕** → [顯示器設置](railway-management/settings.md) 彈窗 |
| 打開顏色設置 | **點擊顯示器行的「▒ 顏色」按鈕** → [顏色設置](railway-management/color.md) 彈窗 |
| 打開廣播 / 月台屏門設置 | **點擊顯示器行的「功能 ▼」按鈕** → 在出現的列表中**點擊「廣播」或「月台屏門」** |
| 推進即將到站列車列表 | 按設定間隔自動翻頁（無需手動操作） |
| 顯示提示 | **點擊右上角的「Hint」開關**將其打開。在此狀態下，將光標懸停在按鈕上並按 **F1** 可跳轉到該功能的 wiki 説明（[F1 的使用方法](getting-started.md#hints-and-f1)） |
| 切換私有 / 公開 | **點擊右下角的臉形圖標** |

> [!TIP]
> 本方塊是放置在車站月台上的「僅顯示」板。如需批量調整數字或顏色，請在彈窗側操作（[顯示器設置](railway-management/settings.md) / [顏色設置](railway-management/color.md)）。彈窗內的數字通過**將光標懸停在數值上並滾動鼠標滾輪**來增減（沒有 ＋ / − 按鈕）。

## 概覽

| 功能 | 説明 |
|---|---|
| 到站列車顯示 | 頂行顯示已停靠的列車（列車名 / 車廂數 / 到站時間 / 發車時間） |
| 下趟列車顯示 | 下方各行顯示接下來到站的列車（多趟） |
| 線路編號 | 在頭部顯示[已分配的](management-computer/stations.md)線路編號 |
| 顯示器鏈接 | 在附近的顯示器方塊上顯示相同內容 |
| 顏色自定義 | 通過[顏色彈窗](railway-management/color.md)更改每個文本元素的顏色 |
| 廣播（SAS） | 通過 [SpatialAudioSystem](railway-management/announcement.md) 整合播放發車旋律 / 廣播 |
| 批量應用 | 一次性將設置應用到同一網絡中的全部方塊 |

## GUI 主要元素

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

| 元素 | 功能 |
|---|---|
| `Hint` 開關 | F1 跳轉 + 鼠標懸停説明的 開 / 關 |
| 頭部編號 | 已分配的線路編號（無則隱藏） |
| 到站列車列表 | 1 項，當前停靠的列車 |
| 下趟列車列表 | 按到站順序從上到下排列，帶分頁 |
| 顯示器行 | 顯示器開關 + 狀態顯示 + 設置 / 顏色 / 廣播按鈕 |
| 所有者臉形 | 私有 / 公開切換 |
| 物品欄 | 玩家物品欄 |

## 相關彈窗

| 彈窗 | 內容 |
|---|---|
| [顯示器設置](railway-management/settings.md) | 字體大小 / 軌道位置 / 時鐘顯示 / 批量應用 |
| [顏色設置](railway-management/color.md) | 10 個文本元素的顏色（到站時間、發車時間、列車名 等） |
| [廣播設置](railway-management/announcement.md) | SAS 整合的條目管理（條件觸發） |

## 相關

- [管理用計算機概述](management-computer/overview.md) — 所有車站與列車的總覽管理
- [顯示器連接卡](tools/monitor-link-card.md) — 與附近顯示器鏈接
- [車站範圍指定工具](tools/station-range-tool.md) — 註冊車站組
