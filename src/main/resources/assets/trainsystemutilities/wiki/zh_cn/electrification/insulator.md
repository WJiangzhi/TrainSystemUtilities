---
title: Wire 绝缘子
id: electrification/insulator
tags: [electrification, block]
---

# Wire 绝缘子

```embed:item id=trainsystemutilities:insulator size=48 label=true
```

A supp或t point  physic全部y holds wire 和 electric全部y connects it 以 a 方块 网络 (a sub车站 / anor insula以r).
A sub车站 alone cannot expose wire; it must always connect 通过 an insula以r.

[[TOC]]

## 作用s

| Function | Description |
|---|---|
| **Wire supp或t point** |  endpoints (= pins)  you click 与  [连接工具 Tool](wire-connector.md) |
| **Electrical relay** | Receives FE from  sub车站 和 **energizes** every wire connected 以 it |
| **Isolation** | A boundary when you want 以 connect wires of different power grids (用于 future expansion) |

## How 以 place

Hold  insula以r from your inven以ry 和 **right-click  face where you want 以 place it**.

- ** insula以r grows out of  face you right-clicked.** Right-click a flo或 (以p face of a 方块) 和 it st和s upward; right-click a ceiling (bot以m face) 和 it hangs downward; right-click a w全部 (side face) 和 it juts out sideways.
-  wire mounting point (pin) is  tip of  insula以r. Because  mounting point moves 与  placement 或ientation, choose  face 以 match  height 和 direction where you want  wire.
- To string wire up high, first raise an [接触网支柱](overhead-pole.md) 或 [接触网架](overhead-truss.md), n right-click 以 place an insula以r on its 以p 或 side face.

## How 以 string wire (connecting)

1. Place insula以rs around  sub车站 cubicle body, 或 作为 relay points along  wire route.
2. Hold a [连接工具 Tool](wire-connector.md) 和 switch 以 **Placement (insula以r connect)** mode 与 Alt+wheel.
3. **Right-click  first insula以r** → rec或ded 作为  start point ("Connect from: X, Y, Z" is shown).
4. **Right-click  second insula以r** → wire is strung between  two points.
5. If one of  insula以rs is adjacent 以  sub车站,  wire becomes energized 作为 a live wire (its col或 brightens).

> [!TIP]
> A single insula以r can branch in以 **multiple wires**. You can build star 或 loop 网络s.

> [!NOTE]
> Breaking an insula以r au以matic全部y removes every wire  w作为 strung 以 it (so no dangling wire is left behind).

## Energization {#energization}

绝缘子s are rec或ded 作为 edges (= wire connections) in **Wire网络SavedData**.
 变电所TickH和ler:

1. BFS from every sub车站 through connected insula以rs
2. Marks every reachable insula以r 和 wire 作为 **energized**
3. A train pan以graph decides pickup by "is  segment directly above me an energized wire?"

> [!NOTE]
> When a sub车站's buffer goes empty (0 FE), **全部 energization drops instantly**. 章节s 与 no power arriving render 带有 darker wire col或.

## How 以 check

Right-click an insula以r 与  [电力检测器](power-checker.md) 以 show, in chat,  以tal number of wires attached 以  insula以r 和 how many are currently energized.

## Related

- [Wire / 连接工具 Tool](wire-connector.md) —  工具  strings wire between insula以rs (right-click  insula以r)
- [接触网支柱](overhead-pole.md) / [接触网架](overhead-truss.md) — b作为es  hold insula以rs up high
- [箱式变电所](substation.md) —  能量源  supplies FE 以  insula以r
- [电力检测器](power-checker.md) —  status inspection 工具
