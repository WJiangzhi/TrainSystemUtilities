---
title: 電氣化系統概述
id: electrification/index
tags: [electrification, overview]
---

# 電氣化系統概述

```embed:items size=48 cols=7 label=true ids=trainsystemutilities:wire_connector,trainsystemutilities:pantograph,trainsystemutilities:fe_inverter,trainsystemutilities:fe_inverter_dummy,trainsystemutilities:substation,trainsystemutilities:insulator,trainsystemutilities:power_checker links=electrification/wire-connector,electrification/pantograph,electrification/fe-inverter,electrification/dummy-inverter,electrification/substation,electrification/insulator,electrification/power-checker
```

> [!TIP]
> 圖示右下角帶有**藍色標記**的可以點選開啟其詳情頁面。

TrainSystem Utilities 的電氣化系統透過**接觸網 + 受電弓 + 箱式變電所**為 Create 列車提供外部 FE 電力。
它可以讓來自 Mekanism / AE2 / Industrial Foregoing 等的 FE 發電機作為 Create 列車的電源或輔助供電。

[[TOC]]

## 總體流程

```
[FE generator (Mek/AE2/IF)] ──FE──▶ [Substation cubicle]
                                       │
                                  (steps up to the wire via insulator)
                                       │
                                       ▼
[Roof-mounted Pantograph] ◀──runs under wire──▶ [Overhead Wire]
        │
        ▼
[FE Inverter] ──FE──▶ [Onboard Create / Mek / ... machines]
```

1. **準備 FE 電源**：Mekanism 反應堆、AE2 能量接收器，任何 FE 源都可以。
2. 搭建[箱式變電所](substation.md)：手持主體並**右鍵**即可自動完成 3×4×2 = 24 方塊的結構。將電力線纜接到 FE 輸入面。
3. 右鍵在軌道旁升起[接觸網支柱](overhead-pole.md)或[接觸網桁架](overhead-truss.md)，然後右鍵在它們頂部以及變電所旁放置[接觸網絕緣子](insulator.md)。
4. 手持[連線工具](wire-connector.md)，按順序右鍵**絕緣子 → 絕緣子**，在軌道上方架設[接觸網](wire-connector.md)（電力從變電所旁的絕緣子流出）。
5. 右鍵在列車車頂安裝[受電弓](pantograph.md)，在車廂內安裝[FE 逆變器](fe-inverter.md)。
6. 執行時，受電弓在經過接觸網下方時會自動集流 → 逆變器為車載 FE 機器供電。

> [!TIP]
> 沿軌道逐一放置支柱和絕緣子非常繁瑣，因此可以使用[接觸網支柱自動工具](../tools/overhead-pole-auto-tool.md)按你設定的高度和數量批次放置支柱、桁架和絕緣子。

## 部件方塊 / 物品

| 物品 | 作用 | 詳情 |
|---|---|---|
| [連線工具](wire-connector.md) | 在兩個絕緣子之間架設接觸網 | 手持並右鍵絕緣子。5 種樣式 + [自定義](custom-wire.md) |
| [接觸網絕緣子](insulator.md) | 接觸網兩端的懸掛點 | 右鍵此方塊以架設接觸網。變電所與接觸網之間的中繼 |
| [接觸網支柱](overhead-pole.md) | 單軌道支撐柱 | 承載絕緣子的底座。右鍵放置在軌道旁 |
| [接觸網桁架](overhead-truss.md) | 跨越多條軌道的龍門支撐 | 承載絕緣子的底座。跨越軌道組 |
| [接觸網支柱自動工具](../tools/overhead-pole-auto-tool.md) | 自動放置支柱 / 桁架 / 絕緣子 | 按設定的高度和數量沿軌道批次放置 |
| [受電弓](pantograph.md) | 車頂集電器 | 右鍵在車頂放置。在接觸網下執行時自動連線 |
| [FE 逆變器](fe-inverter.md) | 車載 FE 緩衝 | 3 格寬裝置。將受電弓的電力提供給車載機器 |
| [模擬逆變器](dummy-inverter.md) | 僅裝飾（無功能） | 外觀同 FE 逆變器，僅 UI 受電弓展開有效 |
| [箱式變電所](substation.md) | 外部 FE 接入 + 接觸網供電 | 3×4×2 多方塊結構 |
| [電力檢測器](power-checker.md) | 除錯工具 | 右鍵絕緣子 / 變電所 / 逆變器 / 受電弓以顯示剩餘 FE 等 |

## 常見問題

> [!NOTE]
> **問：未電氣化的列車還能像以前一樣執行嗎？**
> 答：可以。電氣化系統完全是附加功能，因此 Create 的標準時刻表執行不受影響。

> [!NOTE]
> **問：我想了解每個部件的詳細資訊。**
> 答：從上表中的連結跳轉即可。如需故障排查，請參閱[電力檢測器](power-checker.md)頁面中的"故障排查使用"章節。

> [!IMPORTANT]
> **問：我的列車可以僅靠 Create 能量執行，不使用電氣化嗎？**
> 答：可以。電氣化系統被設計為"超越 Create 能量的輔助電力"。
> 例如，你可以使用 Mek 反應堆作為電源，以便在長途執行中節省 Create 桶裝能量儲備。

## 相關頁面

- [接觸網 / 連線工具](wire-connector.md)
- [自定義接觸網設計](custom-wire.md)
- [接觸網絕緣子](insulator.md)
- [接觸網支柱](overhead-pole.md)
- [接觸網桁架](overhead-truss.md)
- [接觸網支柱自動工具](../tools/overhead-pole-auto-tool.md)
- [受電弓](pantograph.md)
- [FE 逆變器](fe-inverter.md)
- [模擬逆變器](dummy-inverter.md)
- [箱式變電所](substation.md)
- [電力檢測器](power-checker.md)
