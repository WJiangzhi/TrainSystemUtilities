---
title: 電力檢測器
id: electrification/power-checker
tags: [electrification, tool]
---

# 電力檢測器

```embed:item id=trainsystemutilities:power_checker size=48 label=true
```

電氣化系統的**除錯 / 檢查工具**。右鍵目標方塊即可將其電氣化狀態輸出到聊天欄。

[[TOC]]

## 如何使用

手持電力檢測器，**右鍵**點選以下任意目標：

| 目標 | 顯示資訊 |
|---|---|
| **接觸網絕緣子** | 連線的接觸網數量 / 通電數量 / 每段接觸網的 ON/OFF |
| **箱式變電所**（核心或虛擬） | 緩衝 FE / 容量 / 連線的絕緣子和接觸網數量 |
| **FE 逆變器**（已放置） | 緩衝 FE / 容量 |
| **FE 逆變器**（在列車上） | 列車總 `storedEnergy` / 逆變器總容量 |
| **受電弓**（已放置或在列車上） | 當前接觸的接觸網段 / 本 tick 取得 FE |
| 其他 | "Not applicable" — 透傳 |

> [!TIP]
> 輸出到**聊天欄**（而非動作欄）。在專用伺服器和單人遊戲中均可使用。
> 列車顯示的數值來自伺服器 tick，因此即便在行駛中也是準確的。

## 輸出示例

```
[Insulator @ (123, 65, -42)]
  Attached wires: 3
  Energized: 2 / 3
  ▸ wire 1: ON (to insulator @ (118, 65, -42))
  ▸ wire 2: ON (to insulator @ (128, 65, -42))
  ▸ wire 3: OFF (to insulator @ (123, 65, -50))  ← cut grid
```

```
[Substation @ (110, 64, -40)]
  Buffer: 425,032 / 1,000,000 FE (42.5%)
  Energized insulators: 6
  Energized wires: 14
```

```
[FE Inverter (Train #train_jb_03)]
  Train storedEnergy: 12,400 / 80,000 FE (15.5%)
  Mounted inverters: 4 (20,000 FE capacity each)
```

## 故障排查

| 症狀 | 檢查 |
|---|---|
| "列車不動" | 敲擊受電弓——若取流為 0，則上方接觸網未通電 |
| "接觸網顏色發暗" | 敲擊末端的絕緣子 → 沿電網回溯到樞紐 |
| "變電所充不進電" | 敲擊變電所——確認緩衝電量和輸入速率 |
| "列車耗電太快" | 敲擊逆變器——比較消耗與取流 |

## 相關

- [箱式變電所](substation.md) — 主要 FE 電源
- [接觸網絕緣子](insulator.md) — 通電節點
- [受電弓](pantograph.md) — 集電器
- [FE 逆變器](fe-inverter.md) — 車載 FE 緩衝
