---
title: 受電弓
id: electrification/pantograph
tags: [electrification, item, block]
---

# 受電弓

```embed:item id=trainsystemutilities:pantograph size=48 label=true
```

一種安裝在列車車廂頂部的集電裝置。在接觸網下執行時會自動接觸，將 FE / Create 能量傳輸到車廂的緩衝。

[[TOC]]

## 安裝

1. 手持受電弓，**右鍵**點選列車車廂的**車頂（頂面）**以安裝。
2. 在將其組裝進 Create 列車之前先安裝到車廂車頂（一旦組裝完成，它會隨列車一同移動）。
3. 受電弓是 Geckolib 動畫模型，可上下運動（展開 / 收起）。
4. 列車執行時，進入接觸網下方會自動**展開**，離開時會**收起**。

> [!NOTE]
> 標準做法是"每節車廂一個受電弓"。在多節編組中，僅部分車廂搭載受電弓、其餘車廂透過[FE 逆變器](fe-inverter.md)共享緩衝的設計同樣可行。

## 手動展開 / 收起

當你**空手右鍵已放置的受電弓**時，可手動在展開與摺疊之間切換（動作欄會顯示 "Pantograph: Extended / Folded"）。適用於諸如僅在停靠車站時降下受電弓等效果。

當你想一次性操作整列車所有的受電弓時，可從管理計算機的[列車標籤頁](../management-computer/trains.md)選擇列車，並在電氣化詳情中使用"全部展開受電弓" / "全部摺疊受電弓"。

## 供電原理

```
[Wire]
     ↓ contact (while moving)
[Pantograph]
     ↓ FE transfer
[Any car's buffer on the same train]
     - Own car's buffer (pantograph-equipped)
     - Other cars' FE Inverters (coupled cars)
     - Onboard Create machines
```

## 整體連線圖

```
[FE power source / Create energy]
     ↓
[Substation Cubicle] (FE → wire feed)
     ↓ insulator connection
[Wire]
     ↓ contact
[Train Pantograph]
     ↓
[FE Inverter]
     ↓
[Create machines / other-mod electrical mechanisms]
```

## 多節編組時的行為 {#複數連結時の挙動}

- 即便**只有一節車廂**裝有受電弓，FE 也會在整列車範圍內共享
- 在其他車廂上放置[FE 逆變器](fe-inverter.md)也能為其緩衝供電
- 即使列車離開接觸網，仍可依靠剩餘的緩衝 FE 行駛一定距離
- 列車池級別的電氣化檢查（`isTrainElectrified`）——只要有一節車廂位於接觸網下，整列車即視為電氣化

> [!TIP]
> 在一節車廂（如前車）放置受電弓 + 在其他車廂放置 FE 逆變器，即便長編組也能由單個受電弓完全供電。

## 與區塊載入無關

即便列車停靠在已載入區塊之外的車站，其緩衝也不會衰減，返回後重新接觸即可繼續。
變電所側透過 [SubstationRegistry](substation.md#savedata)（SavedData）保持與區塊無關的持續供電。

## 相關

- [接觸網與連線工具](wire-connector.md) — 接觸網鋪設
- [箱式變電所](substation.md) — 為接觸網供電的電源
- [FE 逆變器](fe-inverter.md) — 跨其他車廂的緩衝共享
- [自定義接觸網設計](custom-wire.md) — 粗細 / 排數 / 間距的自由設定
