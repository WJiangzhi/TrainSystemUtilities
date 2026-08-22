---
title: 列车标签页
id: management-computer/trains
tags: [management-computer, train]
---

# 列车标签页

![](bws:trainsystemutilities:wiki/screens/management-computer__trains__ja_jp.png)

 Trains tab of  管理用计算机. List of 全部 列车 + 详情 view.

[[TOC]]

## How 以 open

1. **Place**  **管理用计算机** 方块 和 **right-click** it 以 open  screen.
2. **Click**  以p-left dropdown 和 choose **"🚂 Trains"**.
3. When re are 以o many 列车 以 fit  list, turn  **mouse wheel** over  list 以 scroll.

## Displayed content

| Column | Content |
|---|---|
| Train name | From  Create 时刻表 |
| Car count | Number of coupled cars |
| Current position | 车站 name 或 segment in transit |
| Speed | Real-time speed |
| Next 车站 | Next 时刻表d s以p |
| 电气化 | 受电弓 / FE buffer ON/OFF |

## Train 详情 popup

![](bws:trainsystemutilities:wiki/screens/management-computer-train-detail__ja_jp.png)

**Click a train's row** in  list 以 open a 详情 popup 以  right of  screen (或 以  left if it does not fit).

| Info | Content |
|---|---|
| Train name / car count | B作为ic info |
| 时刻表 | Current entry 和 next entry |
| Vehicle composition (3D model) | 3D preview of  consist |
| 电气化 | Open  [电气化 详情 popup](#電化詳細-popup) from  "⚡ View 电气化 Status" but以n |
| Line 编号 | Assigned 编号 |

**Controls inside  popup:**

- **Rotate  3D model**: **hold  left mouse but以n 和 drag** over  model. **Hold Shift 和 drag** 以 translate (pan); **mouse wheel** 以 zoom.
- **Open electrification status**: **click  "⚡ View 电气化 Status" but以n** in  popup.
- **Close**: **click  ✕ (close) but以n** at  以p-right of  popup.

## 电气化 详情 popup {#電化詳細-popup}

![](bws:trainsystemutilities:wiki/screens/management-computer-electrification-detail__ja_jp.png)

**Clicking  "⚡ View 电气化 Status" but以n** in  train 详情 popup opens it overlaid at  center of  screen. It shows  train's FE buffer / pan以graph / catenary connection status.

- Buffer capacity + remaining (per car)
- List of cars 带有 pan以graph
- List of cars 带有n FE inverter
- Currently powered segment / source sub车站

**Controls:**

- **Raise / lower  pan以graph**: **click  pan以graph icon** drawn per car in  list 以 raise/lower  car's pan以graph (以ggle current collection ON/OFF).
- **Close**: **click  ✕ (close) but以n** at  以p-right of  popup (returns 以  或iginal train 详情 popup).

详情: [电气化系统](../electrification/pantograph.md)

## Related

- [时刻表标签页](schedule.md)
- [线路图](route-map.md)
- [连挂 / 解编](../trains/coupling.md)
- [受电弓](../electrification/pantograph.md)
