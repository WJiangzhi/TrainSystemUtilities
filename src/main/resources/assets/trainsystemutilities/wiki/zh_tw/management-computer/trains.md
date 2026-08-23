---
title: 列車標籤頁
id: management-computer/trains
tags: [management-computer, train]
---

# 列車標籤頁

![](bws:trainsystemutilities:wiki/screens/management-computer__trains__ja_jp.png)

管理用計算機的"列車"標籤頁。所有列車的列表 + 詳情檢視。

[[TOC]]

## 如何開啟

1. **放置**管理用計算機方塊並**右鍵點選**它以開啟介面。
2. **點選**左上角下拉選單並選擇**"🚂 列車"**。
3. 當列車過多無法在列表中全部顯示時，在列表上轉動**滑鼠滾輪**滾動。

## 顯示內容

| 列 | 內容 |
|---|---|
| 列車名 | 來自 Create 時刻表 |
| 車廂數 | 連掛的車廂數量 |
| 當前位置 | 車站名或執行中的路段 |
| 速度 | 實時速度 |
| 下一車站 | 下一計劃停靠站 |
| 電氣化 | 受電弓 / FE 緩衝 開啟/關閉 |

## 列車詳情彈窗

![](bws:trainsystemutilities:wiki/screens/management-computer-train-detail__ja_jp.png)

在列表中**點選某一列車的行**，會在介面右側開啟詳情彈窗（如果右側放不下則顯示在左側）。

| 資訊 | 內容 |
|---|---|
| 列車名 / 車廂數 | 基本資訊 |
| 時刻表 | 當前條目和下一條目 |
| 車輛編組（3D 模型） | 編組的 3D 預覽 |
| 電氣化 | 透過"⚡ 檢視電氣化狀態"按鈕開啟[電氣化詳情彈窗](#電化詳細-popup) |
| 線路編號 | 已分配的編號 |

**彈窗內的操作：**

- **旋轉 3D 模型**：在模型上**按住滑鼠左鍵並拖動**。**按住 Shift 拖動**可平移；**滑鼠滾輪**縮放。
- **開啟電氣化狀態**：**點選彈窗中的"⚡ 檢視電氣化狀態"按鈕**。
- **關閉**：**點選彈窗右上角的 ✕（關閉）按鈕**。

## 電氣化詳情彈窗 {#電化詳細-popup}

![](bws:trainsystemutilities:wiki/screens/management-computer-electrification-detail__ja_jp.png)

在列車詳情彈窗中**點選"⚡ 檢視電氣化狀態"按鈕**，會在介面中央疊加開啟此彈窗。它顯示列車的 FE 緩衝 / 受電弓 / 接觸網連線狀態。

- 緩衝容量 + 剩餘（每節車廂）
- 帶有受電弓的車廂列表
- 帶有 FE 逆變器的車廂列表
- 當前供電路段 / 來源變電所

**操作：**

- **升降受電弓**：**點選列表中每節車廂旁繪製的受電弓圖示**可升降該車廂的受電弓（切換受流開啟/關閉）。
- **關閉**：**點選彈窗右上角的 ✕（關閉）按鈕**（返回原來的列車詳情彈窗）。

詳情：[電氣化系統](../electrification/pantograph.md)

## 相關

- [時刻表標籤頁](schedule.md)
- [線路圖](route-map.md)
- [連掛 / 解編](../trains/coupling.md)
- [受電弓](../electrification/pantograph.md)
