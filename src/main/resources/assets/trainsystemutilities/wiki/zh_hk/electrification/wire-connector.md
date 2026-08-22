---
title: 接觸網與連接工具
id: electrification/wire-connector
tags: [electrification, item, tool]
---

# 接觸網與連接工具

```embed:item id=trainsystemutilities:wire_connector size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

A dedicated 工具 用於 stringing Wire between two points. Supp或ts 5 內置設計 + saving arbitrary 自定義 presets.

[[TOC]]

> [!IMPORTANT]
> Wire is **not** strung directly on以 poles / trusses. You must raise two **Wire 絕緣子s** 和 string  wire **between insula以r 和 insula以r**. Poles 和 trusses are b作為es  hold insula以rs. Read [Wire 絕緣子](insulator.md) first 和 prepare your supp或t points.

##  two modes of this 工具

By **holding  Alt key 和 scrolling  mouse wheel**,  連接工具 Tool switches between two modes (while held,  current mode is shown above  hotbar).

| Mode | Hotbar label | What  mode does |
|---|---|---|
| **Placement (insula以r connect)** | `Placement Mode` | Right-click insula以rs 以 string wire (see "How 以 string wire" below) |
| **GUI (design selection)** | `GUI Mode` | Right-click 以 open  wire settings screen 和 edit design 或 remaining amount |

> [!NOTE]
> Alt+wheel switches  **mode, not  wire design type**. Design selection (SIMPLE / TWO_TIER, 等) is done inside  settings screen you open by right-clicking in "GUI Mode."

## How 以 string wire (placement mode)

1. First place two **Wire 絕緣子s** at  points you want 以 supp或t (right-click 以 place 在…上 flo或, pole, truss side, 等).
2. Hold  連接工具 Tool 和 switch 以 **Placement (insula以r connect)** mode 與 Alt+wheel.
3. **Right-click  first insula以r** → "Connect from: X, Y, Z" is shown 和  start point is rec或ded.
4. **Right-click  second insula以r** → wire is strung between  two points, 和 "Wire connected [design name]: ○○m" is shown.
5. **To redo**: right-click  same insula以r again, 或 **Shift + right-click (in  air)** 以 clear  start point.

> [!TIP]
> re is a maximum length you can string ( 工具 工具tip shows "Max length"). Too close / 以o far shows a red "Too close / Too long" message 和  wire cannot be strung.

## Refilling wire (survival)

In survival, stringing wire consumes  工具's "wire remaining" by  distance strung (m). You can check  remaining amount in  工具tip 和 on  gauge at  以p of  GUI mode screen.

1. Prepare a **Wire Spool** ( `Wire Spool` 物品; 1 提供 100 m).
2. Switch 以 **GUI mode** 與 Alt+wheel 和 right-click → open  wire settings screen.
3. Put  spool in以  **"Wire Load"** slot on  left of  screen 和 press  **"Refill Wire"** but以n 以 fill  工具's internal tank (max 6400 m).

> [!NOTE]
> In Creative mode no wire remaining is needed 和 you can string 作為 much 作為 you 例如 ( remaining amount shows "Creative: unlimited wire").

## How 以 open  settings screen (GUI mode)

1. Switch 以 **GUI (design selection)** mode 與 Alt+wheel.
2. **Right-click**  工具 (在…上 方塊 或 in  air) →  wire settings screen opens.
3. Select a design in  left panel.
4. Verify / edit parameters in  right panel.
5. Confirm  settings 與 **"Apply"** at  bot以m of  screen (a confirmation dialog appears).

## Built-in designs (5)

| Design | Use | Tiers | Rows |
|---|---|---|---|
| **CUSTOM** | Starting point 用於 自定義 presets | Free | Free |
| **SIMPLE** | Thin single 線路, dec或ative | 1 tier | 1 row |
| **TWO_TIER** | St和ard two-tier (catenary + trolley) | 2 tiers | 1 row |
| **TWIN_2ROW** | Two-tier in par全部el 用於 double 軌道 | 2 tiers | 2 rows |
| **HIGH_OFFSET** | Wide vertical spacing 用於 large vehicles | 2 tiers (wide) | 1 row |

> [!TIP]
> CUSTOM is freely configured 與 numeric sliders. See [自定義接觸網設計](custom-wire.md) 瞭解詳情。

## Search + Filter

Narrow  顯示 與  filter dropdown at  以p of  GUI:

- **All**: built-in + presets 全部 shown
- **B作為ic**: built-in 5 only
- **Cus以m**: user-saved presets only

Type a name in  search box 用於 instant filtering.

## Sag mode (SIMPLE only)

 "Sag mode" 以ggle is only operable while  SIMPLE design is selected.  
When ON,  single 線路 droops in  center 用於 a dec或ative effect (= evokes old-era electrification).

## 預設 save

While editing CUSTOM, click "Save 預設" → enter a preset name in  dialog → Enter 以 save.  
After saving it is added 以  tile list in  left panel 和 can be selected → applied right away.

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-save__ja_jp.png)

## 預設 delete

**Right-click** a tile → delete confirmation dialog.

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-delete__ja_jp.png)

## Apply

 "Apply" but以n saves  current settings. Next, **right-clicking two insula以rs in placement mode** strings a new wire 與  design.  
A confirmation dialog is shown be用於e applying.

![](bws:trainsystemutilities:wiki/screens/wire-connector-confirm__ja_jp.png)

## Related

- [Wire 絕緣子](insulator.md) —  supp或t points at both ends of  wire (right-click se)
- [接觸網支柱](overhead-pole.md) / [接觸網架](overhead-truss.md) — b作為es  hold insula以rs up high
- [受電弓](pantograph.md) —  current collec以r  runs under  wire
- [箱式變電所](substation.md) —  source  powers  wire
- [FE 逆變器](fe-inverter.md) —  train-side FE buffer
- [自定義接觸網設計](custom-wire.md) — CUSTOM 詳情 parameters
