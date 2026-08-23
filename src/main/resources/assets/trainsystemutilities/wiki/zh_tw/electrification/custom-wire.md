---
title: 自定義接觸網設計
id: electrification/custom-wire
tags: [electrification, customization, tool]
---

# 自定義接觸網設計

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

[連線工具](wire-connector.md)的 `CUSTOM` 模式所使用的自由引數調節 + 預設儲存系統。

[[TOC]]

## 如何開啟

1. 手持[連線工具](wire-connector.md)，透過 **Alt+滾輪** 切換到 **GUI（樣式選擇）** 模式。
2. **右鍵**點選工具，開啟接觸網設定介面。
3. 在左側面板的樣式磁貼中選擇 **CUSTOM**，右側面板會切換到下方的編輯模式。

## 選擇 CUSTOM 時的編輯面板

選擇 CUSTOM 磁貼後，右側面板會切換到編輯模式，你可以用**滑鼠滾輪**調整以下數值：

| 引數 | 範圍 | 步長 | 用途 |
|---|---|---|---|
| **粗細** | 0.01 – 0.30 | 0.01 | 接觸網本體的線寬（視覺） |
| **垂直間距** | 0.00 – 2.00 m | 0.05 | 承力索與接觸線之間的間距（0 = 單層，>0 = 雙層） |
| **吊弦間隔** | 0.50 – 10.00 m | 0.25 | 垂直支撐（吊弦）的間隔 |
| **雙排佈局** | OFF / ON | — | 雙軌道時接觸網成對並排佈置 |

## 滑鼠滾輪操作

將游標懸停在每個數字框上，然後：
- **滾輪向上**：增大數值
- **滾輪向下**：減小數值
- 在最小值/最大值處自動鉗制

數值會實時反映到右側面板的**預覽區**（磁貼圖片本身不會變化）。

## 預設儲存

"**Save Preset**" 按鈕僅在編輯 CUSTOM 時啟用。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-save__ja_jp.png)

1. 點選 "Save Preset" 按鈕 → 出現儲存對話方塊
2. 輸入預設名稱（預設：`PresetN`）
3. **Enter** 儲存 / **Esc** 取消

儲存後，預設會被新增到左側面板的磁貼列表（= 樣式磁貼）中，可以立即選用。

## 預設刪除

**右鍵**點選預設磁貼 → 刪除確認對話方塊。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-delete__ja_jp.png)

## 如何使用預設

- 左鍵：應用預設 → 自定義引數被**鎖定**為預設值（滾輪禁用）
- 回到編輯模式：從磁貼列表中選擇 **CUSTOM**

> [!TIP]
> 預設與正在編輯的數值是分開管理的。已儲存的預設無法編輯，若要修改某個預設，請新建一個並刪除舊的。

## 與下垂模式的關係

下垂模式**僅適用於 SIMPLE**，不能與 CUSTOM 一起使用。
即便 CUSTOM 設計設定為單層 + 細線，也不會下垂（= 僅呈直線）。

## 與列車預設的互動

用自定義接觸網鋪設的路段不會儲存在列車預設側（= 接觸網屬於世界側實體）。
若要在其他世界鋪設外觀相同的接觸網，請共享連線工具的預設 JSON。

## 相關

- [接觸網 / 連線工具](wire-connector.md) — 基本操作與內建樣式
- [受電弓](pantograph.md)
- [箱式變電所](substation.md)
- [FE 逆變器](fe-inverter.md)
