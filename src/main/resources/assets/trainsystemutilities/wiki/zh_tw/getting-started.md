---
title: 快速開始
id: getting-started
tags: [tutorial, beginner]
---

# 快速開始

本頁面幫助你逐步瞭解：剛拿到 TrainSystem Utilities 時，「哪個 GUI 管理什麼」「按下 F1 會發生什麼」。

[[TOC]]

> [!NOTE]
> 本 MOD 需要 **Create 1.21.1 相容版本**。它與 Create 的時刻表 / 車站 / 訊號機制緊密整合。

## 本 MOD 的 GUI 一覽

TSU 的 GUI 大致分為 **「右鍵方塊開啟的」** 和 **「手持物品使用的」** 兩類。按下文「如何開啟」一欄所示的方式操作即可開啟對應 GUI。

### 方塊 GUI（放置後右鍵）

| GUI | 如何開啟 | 作用 |
|---|---|---|
| 管理用計算機 | 放置方塊後 **右鍵** | 監控與配置整個網路的中樞。透過下方的標籤組切換使用 |
| 鐵路管理方塊 | 放置在車站月臺上並 **右鍵** | 單個車站的顯示板（到站 / 下一趟列車 / 車站顯示器） |
| 海報管理方塊 | **右鍵** 方塊 | 以輪播方式顯示 PNG/JPG 圖片 |
| 自動售票機 | **右鍵** 方塊 | 選擇目的地併購票 |

### 管理用計算機的標籤頁 / 子介面

透過標籤切換或按鈕，從管理用計算機中開啟。

| 介面 | 如何開啟 | 作用 |
|---|---|---|
| 線路圖 / 列車 / 時刻表 / 車站 / 自動售票機 / 線路編號 標籤頁 | 用左上角下拉框（顯示器）或標籤切換 | 各功能的列表 / 設定 |
| 線路編號編輯器 | 線路編號標籤頁 → **「＋ 新建」** / 點選已有編號 | 編輯編號的文字 / 顏色 / 形狀（內建取色器） |
| 佈局編輯器 | 底部的 **「Layout」** 按鈕 | 編輯顯示器面板的排列方式 |
| 顏色設定 / 取色器 | 底部的 **「Color」** 按鈕 | 更改顯示器的配色 |
| 時刻表編輯器 | 時刻表標籤頁 → 選擇一列列車並編輯 | 編輯 / 匯出 Create 時刻表 |

### 物品 GUI / 工具（手持使用）

| 工具 | 如何開啟 / 操作 | 作用 |
|---|---|---|
| 換乘查詢終端 | 手持並 **右鍵** | 路線、行駛時間與車站間耗時的導引 |
| 車站範圍指定工具 | 手持，用 **Alt+滾輪** 切換模式，右鍵指定 | 建立車站組 / 關聯自動售票機與閘門 |
| 列車預設工具 | 手持並 **右鍵**（設定）/ 透過模式切換放置 | 將列車儲存為 JSON、放置列車、補充材料 |
| 連線工具 | 手持並 **右鍵** | 鋪設接觸網 / 自定義接觸網預設 |
| 電線杆自動放置工具 | 手持，用 **Alt/Ctrl/Shift+滾輪** 配置，右鍵放置 | 依次自動放置電線杆 |

### 電氣化系統（方塊 / 裝置）

| 裝置 | 作用 |
|---|---|
| 受電弓 / 接觸網 / 箱式變電所 / FE 逆變器 | 透過架空接觸網為列車提供 FE / Create 能量（詳見 [電氣化系統](electrification/pantograph.md)） |

### 線上共享（Preset Place）

| 介面 | 如何開啟 | 作用 |
|---|---|---|
| 預設瀏覽 / 詳情 / 上傳 / 個人資料 / 創作者中心 | 從列車預設工具的選單中開啟 | 線上共享你自己的列車預設 |

### 鐵路管理方塊預覽

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

### 連線工具預覽

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

## 提示與 F1 {#hints-and-f1}

在每個 GUI 右上角開啟 **Hint** 開關後，將滑鼠懸停在按鈕 / 物品上時會顯示簡短說明。  
在此狀態下按 **F1**，wiki 會直接跳轉到你當前懸停功能的說明章節。

> [!TIP]
> 把 F1 理解成 **「跳轉到該功能說明的按鍵」**，而不是「開啟 wiki 的按鍵」會更好。
> 例如：將滑鼠懸停在顯示器開關上按 F1 → 直接開啟「顯示器顯示」章節。

### 使用流程

1. 將 `Hint` 開關開啟。
2. 把游標移到你想了解的按鈕 / 標籤上。
3. 按下 **F1**。
4. 自動跳轉到對應功能的 wiki 標題。

## 建議先熟悉的一條流程

1. 在 [管理用計算機概述](management-computer/overview.md) 中瞭解各標籤頁分別負責什麼。
2. 想觀察列車執行時，閱讀 [列車標籤頁](management-computer/trains.md) 與 [時刻表標籤頁](management-computer/schedule.md)。
3. 想整理車站顯示的線路編號時，閱讀 [車站標籤頁](management-computer/stations.md) 與 [線路編號標籤頁](management-computer/line-symbols.md)。
4. 想檢視車站側的顯示時，閱讀 [鐵路管理方塊](railway-management.md)。
5. 想搭建圖片顯示時，閱讀 [海報管理方塊](poster-management.md)。
6. 想為列車供電時，閱讀 [電氣化系統](electrification/pantograph.md)。

> [!WARNING]
> 伺服器執行時，**私有模式** 是必須的。其他玩家可能會改寫你的時刻表。
> 原則上，主線上的管理用計算機應設為私有。

## 選擇訪問模式 {#access-mode}

可以透過每個 GUI 右下角的臉形圖示切換模式。

<details>
<summary>私有 / 公開的區別</summary>

| 模式 | 顯示 | 設定更改 | 適用場景 |
|---|---|---|---|
| 公開 | 藍框臉形 | 任何人都能更改 | 協作運營 / 測試世界 |
| 私有 | 紅框臉形 | 僅放置者可改 | 主線運營 / 多人聯機 |

使用儲存卡建立和讀取連結與模式無關，但開關操作和顏色設定受訪問模式限制。

</details>

## GUI 自動縮放

所有 V3 GUI 都會自動按 Minecraft 的 GUI 縮放（1×/2×/3×/4×）和螢幕尺寸進行縮小適配。

- **基準為 GUI 縮放 2×**（= 1920×1080 下 960×540 視口）。所有對話方塊都按此基準設計。
- 在 4× 或小屏 MOD 環境下對話方塊溢位時會自動縮小（5% 邊距）
- 可透過子類的 `autoScaleEnabled() = false` 禁用

## 新 wiki 系統功能

本頁使用的 `embed:item` / `embed:items` / `embed:screen` / `embed:model` 機制：

| 語法 | 用途 |
|---|---|
| `embed:item id=<modid:itemid> size=N` | ItemStack 渲染，和物品欄格子一樣 |
| `embed:model id=<itemid> size=N rotate=true` | BlockItem 的 3D 展示（自動旋轉） |
| `embed:screen id=<screen-id>` | 顯示擷取的 V3 介面（自動切換到當前語言） |

GUI 截圖在登入時自動生成，因此無需開啟介面即可在 wiki 中檢視全部內容。  
切換語言後，執行 `/tsu-wiki-prebuild` 重新生成該語言的截圖。

## 接下來閱讀的頁面

- [管理用計算機概述](management-computer/overview.md)
- [鐵路管理方塊](railway-management.md)
- [電氣化系統](electrification/pantograph.md)
- [海報管理方塊](poster-management.md)
