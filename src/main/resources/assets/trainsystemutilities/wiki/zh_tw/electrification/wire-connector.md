---
title: 接觸網與連線工具
id: electrification/wire-connector
tags: [electrification, item, tool]
---

# 接觸網與連線工具

```embed:item id=trainsystemutilities:wire_connector size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

一種用於在兩點之間架設接觸網的專用工具。支援 5 種內建樣式 + 儲存任意自定義預設。

[[TOC]]

> [!IMPORTANT]
> 接觸網**不能**直接架設到支柱 / 桁架上。必須升起兩個**接觸網絕緣子**，並在**絕緣子與絕緣子之間**架設接觸網。支柱和桁架是承載絕緣子的底座。請先閱讀[接觸網絕緣子](insulator.md)並準備好支撐點。

## 此工具的兩種模式

透過**按住 Alt 鍵並滾動滑鼠滾輪**，連線工具可在兩種模式間切換（手持時，當前模式會顯示在物品欄上方）。

| 模式 | 物品欄標籤 | 模式作用 |
|---|---|---|
| **放置（絕緣子連線）** | `Placement Mode` | 右鍵絕緣子以架設接觸網（見下方"如何架設接觸網"） |
| **GUI（樣式選擇）** | `GUI Mode` | 右鍵開啟接觸網設定介面，編輯樣式或剩餘量 |

> [!NOTE]
> Alt+滾輪切換的是**模式，而非接觸網樣式型別**。樣式選擇（SIMPLE / TWO_TIER 等）在"GUI 模式"下右鍵開啟的設定介面內進行。

## 如何架設接觸網（放置模式）

1. 首先在想要支撐的兩個點放置**接觸網絕緣子**（右鍵放置在地板、支柱、桁架側面等上）。
2. 手持連線工具，用 Alt+滾輪切換到**放置（絕緣子連線）** 模式。
3. **右鍵第一個絕緣子** → 顯示 "Connect from: X, Y, Z" 並記錄起點。
4. **右鍵第二個絕緣子** → 在兩點之間架設接觸網，並顯示 "Wire connected [design name]: ○○m"。
5. **重做**：再次右鍵同一個絕緣子，或 **Shift + 右鍵（向空中）** 清除起點。

> [!TIP]
> 架設有最大長度限制（工具提示顯示 "Max length"）。過近 / 過遠會顯示紅色 "Too close / Too long" 提示，無法架設接觸網。

## 接觸網補充（生存模式）

生存模式下，架設接觸網會按架設距離（m）消耗工具的"接觸網剩餘量"。可在工具提示和 GUI 模式介面上方的量表中檢視剩餘量。

1. 準備一個**接觸網線軸**（`Wire Spool` 物品；1 個提供 100 m）。
2. 用 Alt+滾輪切換到 **GUI 模式** 並右鍵 → 開啟接觸網設定介面。
3. 將線軸放入螢幕左側的 **"Wire Load"** 槽位，點選 **"Refill Wire"** 按鈕即可填充工具的內部儲罐（最大 6400 m）。

> [!NOTE]
> 創造模式下無需接觸網剩餘量，可隨意架設（剩餘量顯示 "Creative: unlimited wire"）。

## 如何開啟設定介面（GUI 模式）

1. 用 Alt+滾輪切換到 **GUI（樣式選擇）** 模式。
2. **右鍵**點選工具（對方塊或向空中） → 開啟接觸網設定介面。
3. 在左側面板選擇樣式。
4. 在右側面板檢視 / 編輯引數。
5. 用螢幕底部的 **"Apply"** 確認設定（會出現確認對話方塊）。

## 內建樣式（5 種）

| 樣式 | 用途 | 層數 | 排數 |
|---|---|---|---|
| **CUSTOM** | 自定義預設的起點 | 自由 | 自由 |
| **SIMPLE** | 細單線，裝飾用 | 1 層 | 1 排 |
| **TWO_TIER** | 標準雙層（承力索 + 接觸線） | 2 層 | 1 排 |
| **TWIN_2ROW** | 雙軌用的平行雙層 | 2 層 | 2 排 |
| **HIGH_OFFSET** | 大型車輛用的寬垂直間距 | 2 層（寬） | 1 排 |

> [!TIP]
> CUSTOM 用數字滑塊自由配置。詳見[自定義接觸網設計](custom-wire.md)。

## 搜尋 + 篩選

用 GUI 頂部的篩選下拉選單縮小顯示範圍：

- **All**：內建 + 預設全部顯示
- **Basic**：僅內建 5 種
- **Custom**：僅使用者儲存的預設

在搜尋框輸入名稱即可即時篩選。

## 下垂模式（僅 SIMPLE）

"下垂模式"開關僅在選中 SIMPLE 樣式時可操作。
開啟後，單線中央會下垂以產生裝飾效果（= 營造舊時代電氣化的感覺）。

## 預設儲存

編輯 CUSTOM 時，點選 "Save Preset" → 在對話方塊中輸入預設名稱 → Enter 儲存。
儲存後會新增到左側面板的磁貼列表中，可立即選用 → 應用。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-save__ja_jp.png)

## 預設刪除

**右鍵**點選磁貼 → 刪除確認對話方塊。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-delete__ja_jp.png)

## 應用

"Apply" 按鈕儲存當前設定。接著，**在放置模式下右鍵兩個絕緣子**即可用該樣式架設新的接觸網。
應用前會顯示確認對話方塊。

![](bws:trainsystemutilities:wiki/screens/wire-connector-confirm__ja_jp.png)

## 相關

- [接觸網絕緣子](insulator.md) — 接觸網兩端的支撐點（右鍵這些）
- [接觸網支柱](overhead-pole.md) / [接觸網桁架](overhead-truss.md) — 在高處承託絕緣子的底座
- [受電弓](pantograph.md) — 在接觸網下執行的集電器
- [箱式變電所](substation.md) — 為接觸網供電的電源
- [FE 逆變器](fe-inverter.md) — 列車側 FE 緩衝
- [自定義接觸網設計](custom-wire.md) — CUSTOM 詳細引數
