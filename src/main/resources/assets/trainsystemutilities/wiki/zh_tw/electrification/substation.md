---
title: 箱式變電所
id: electrification/substation
tags: [electrification, block, multiblock]
---

# 箱式變電所

```embed:item id=trainsystemutilities:substation size=48 label=true
```

一種 3×4×2 = 24 方塊的多方塊結構。它接受外部 FE 電力（Mekanism / AE2 / Industrial Foregoing 等），並透過絕緣子輸送到接觸網。

[[TOC]]

## 安裝

1. 確保放置空間充足（= 3 寬 × 4 深 × 2 高 = 24 方塊體積）。
2. 手持變電所主體，**右鍵點選你想要作為基礎方塊的位置**。結構的朝向由玩家面朝的方向決定。
3. 以點選位置為基礎，自動放置 23 個虛擬方塊，完成 3×4×2 結構。
4. 該結構被視為單個邏輯方塊（右鍵任意方塊都會作為主體響應）。

> [!WARNING]
> 若放置空間不足，會出現 `Not enough space to place (3×4×2 required)` 提示且放置失敗。
> 拆除時，破壞 24 個方塊中的任意一個，全部方塊會同時消失。

## 狀態檢查（右鍵）

當你**空手右鍵已放置的變電所**時，其當前狀態會在聊天欄顯示（不會開啟專用 GUI 介面）。

| 顯示 | 含義 |
|---|---|
| **通電中** | FE 可用，正透過絕緣子向接觸網網路供電 |
| **等待連線** | FE 可用，但尚未連線絕緣子 / 接觸網 |
| **FE 短缺** | 外部電源未輸入 FE |

同時還會顯示當前 FE 電量 / 容量以及連線的接觸網網路數量。需要更詳細調查時，請使用[電力檢測器](power-checker.md)。

## 連線（輸入 + 輸出）

```
[FE power source (Mekanism Cable / Create Energy etc)]
     ↓ connect (any face)
[Substation Cubicle]
     ↓ via insulator block
[Wire]
     ↓
[Train Pantograph]
```

### FE 輸入

- 變電所在任意虛擬面上接受 IEnergyStorage 能力
- 任何相容 FE 的電源均可：Mekanism Universal Cable、AE2 Energy Cell、Create 電動引擎等
- 內部緩衝容量：1,000,000 FE
- 接收速率：10,000 FE/tick

### 接觸網輸出

要從變電所向接觸網輸送電力，需在**緊貼**變電所的位置立起一個絕緣子，並從那裡佈設接觸網。

1. 右鍵在**緊鄰**變電所主體的方塊上放置[接觸網絕緣子](insulator.md)（該絕緣子成為連線變電所和接觸網的入口點）。
2. 用[連線工具](wire-connector.md)切換到放置模式右鍵該絕緣子 → 然後右鍵下一個絕緣子即可佈設接觸網。
3. 緊鄰變電所的絕緣子之外的接觸網網路會變為**通電**（通電的接觸網會發出更亮的光）。
4. 單個變電所可分支多段接觸網。

## 與區塊載入無關 {#savedata}

`SubstationRegistry`（按維度的 SavedData）記錄變電所的位置 + FE + 朝向。
即便玩家未載入該區塊：

- 變電所的 FE 攝入仍會持續（前提是外部電源所在區塊已載入）
- 已載入區塊之外的通電列車會繼續從緩衝抽取 FE
- 列車返回時緩衝電量保持準確

> [!TIP]
> 在大規模鐵路線上，只要緩衝未耗盡，列車即便離開已載入區塊仍能駛過長距離路段。反之，緩衝容量設計也很重要。

## 模型

基於 Geckolib 的靜態模型（無動畫）。紋理為灰色 + 點綴色。
3×4×2 結構中全部 24 方塊的外觀由單個 BlockEntity 渲染。

> [!NOTE]
> 變電所核心方塊帶有 BlockEntity。23 個虛擬方塊無 BlockEntity；能力訪問透過 [SubstationMultiblock.findCore](https://github.com/hololocheck/TrainSystemUtilities/blob/master/src/main/java/com/trainsystemutilities/electrification/block/SubstationMultiblock.java) 路由到核心。

## 相關

- [受電弓](pantograph.md) — 在接觸網下執行的集電器
- [接觸網與連線工具](wire-connector.md) — 接觸網鋪設
- [FE 逆變器](fe-inverter.md) — 列車側 FE 緩衝
- [自定義接觸網設計](custom-wire.md) — 接觸網外觀自定義
