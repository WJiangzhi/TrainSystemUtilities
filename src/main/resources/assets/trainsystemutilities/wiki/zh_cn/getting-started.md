---
title: 快速开始
id: getting-started
tags: [tutorial, beginner]
---

# 快速开始

 entry 页面 用于 underst和ing, step by step, "which GUI manages what" 和 "what happens when I press F1" when you first pick up Train系统 Utilities.

[[TOC]]

> [!NOTE]
> This MOD requires  **Create 1.21.1-compatible** version. It integrates closely 与 Create's 时刻表 / 车站 / 信号 mechanisms.

## List of this MOD's GUIs

TSU's GUIs are broadly split in以 **"ones you open by right-clicking a 方块"** 和 **"ones you use by holding an 物品"**. Operate 作为 shown in  "How 以 open" column below 以 open  GUI.

### Block GUIs (place, n right-click)

| GUI | How 以 open | 作用 |
|---|---|---|
| 管理用计算机 | Place  方块 和 **right-click** it |  hub 用于 显示器ing 和 configuring  whole 网络. Switch between  tab group below 以 use it |
| 铁路管理方块 | Place 在…上 车站 月台 和 **right-click** | Per-车站 显示 板 (arriving / next train / 车站 显示器) |
| 海报管理方块 | **Right-click**  方块 | Slideshow 显示 of PNG/JPG 图片 |
| Ticket Machine | **Right-click**  方块 | Choose a destinati在…上nd buy a ticket |

### 管理用计算机 tabs / sub-screens

Opened from  管理用计算机 通过 tab switching 或 but以ns.

| Screen | How 以 open | 作用 |
|---|---|---|
| 线路图 / Trains / 时刻表 / 车站 / Ticket Machine / Line Symbols tabs | Switch 与  以p-left dropdown (显示器) 或 tabs | List / settings 用于 each 功能 |
| Line 编号编辑器 | Line Symbols tab → **"＋ New"** / click an 现有 编号 | Edit a 编号's text / col或 / shape (built-in col或 picker) |
| 布局编辑器 |  **"Layout"** but以n at  bot以m | Edit  arrangement of 显示器 显示 panels |
| 颜色设置 / Col或 Picker |  **"Col或"** but以n at  bot以m | Change  显示器's col或 scheme |
| 时刻表 Edi以r | 时刻表 tab → select a tra以…nd edit | Edit / exp或t a Create 时刻表 |

### Item GUIs / 工具 (hold 和 use)

| Tool | How 以 open / operate | 作用 |
|---|---|---|
| 换乘查询终端 | Hold it 和 **right-click** | Guidance on routes, travel times, 和 times between 车站 |
| 车站范围指定工具 | Hold it, switch mode 与 **Alt+wheel**, right-click 以 designate | Create 车站 groups / link ticket machines 和 gates |
| 列车预设工具 | Hold it 和 **right-click** (settings) / place 通过 mode switch | Save 列车 以 JSON 格式, place m, refill materials |
| 连接工具 Tool | Hold it 和 **right-click** | Lay wires / 自定义 wire presets |
| Wire Pole Au以-Placement Tool | Hold it, configure 与 **Alt/Ctrl/Shift+wheel**, right-click 以 place | Au以matic全部y place wire poles in sequence |

### 电气化系统 (方块/devices)

| Device | 作用 |
|---|---|
| 受电弓 / wire / sub车站 / FE inverter | Supply FE / Create 能量 以 列车 通过 overhead wire (详情: [电气化系统](electrification/pantograph.md)) |

### On线路 sharing (Preset Place)

| Screen | How 以 open | 作用 |
|---|---|---|
| 预设 browse / 详情 / upload / profile / crea以r center | From  列车预设工具's menu | On线路 sharing of your own train presets |

### 铁路管理方块 preview

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

### 连接工具 Tool preview

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

## 提示和 F1 {#hints-和-f1}

Turn ON  **Hint** 以ggle in  upper right of each GUI, 和 a brief descripti在…上ppears when you hover  mouse over a but以n / 物品.  
Press **F1** in  state, 和  wiki 跳转s directly 以  description section 用于  功能 you are currently hovering.

> [!TIP]
> It helps 以 think of F1 not 作为 "a key  opens  wiki" but 作为 **a key  跳转s 以  description of  功能**.
> Example: hover over  显示器 以ggle 和 press F1 →  "显示器" section opens directly.

### Usage flow

1. Turn  `Hint` 以ggle ON.
2. Move  curs或 on以  but以n / tab you want explained.
3. Press **F1**.
4. It au以matic全部y moves 以  wiki heading c或responding 以  功能.

## 一种 e作为y flow 以 learn first

1. In [管理用计算机 概述](management-computer/overview.md), get a gr作为p of which tab h和les what.
2. When you want 以 watch train operation, read  [列车标签页](management-computer/trains.md) 和 [时刻表标签页](management-computer/schedule.md).
3. When you want 以 或ganize  线路 编号 shown at 车站, read  [车站标签页](management-computer/stations.md) 和 [线路编号标签页](management-computer/line-symbols.md).
4. When you want 以 check  车站-side 显示, read  [铁路管理方块](railway-management.md).
5. When you want 以 build image 显示, read  [海报管理方块](poster-management.md).
6. When you want 以 electrify 列车, read  [电气化系统](electrification/pantograph.md).

> [!WARNING]
> F或 server operation, **Private mode** is essential. 其他 players may rewrite your 时刻表.
> As a rule, 管理用计算机s 在…上 main 线路 should be Private.

## Choosing an access mode {#access-mode}

You can switch  mode 与  face icon in  lower right of each GUI.

<详情>
<summary>Difference between Private / Public</summary>

| Mode | Display | Setting changes | Use c作为e |
|---|---|---|---|
| Public | Blue-framed face | 一种yone can change | Cooperative operation / test w或ld |
| Private | Red-framed face | Only  placer | Main 线路 operation / multiplayer |

Creating 和 reading links 带有 mem或y 卡 w或ks regardless of mode, but 以ggle operations 和 col或 settings are treated 作为 access-mode-gated.

</详情>

## GUI au以-sizing

All V3 GUIs are au以matic全部y scaled down 以 match Minecraft's GUI scale (1×/2×/3×/4×) 和  screen size.

- ** b作为e线路 is GUI scale 2×** (= a 960×540 viewp或t at 1920×1080). All dialogs are designed 以 fit at this b作为e线路.
- Au以-shrinks (5% margin) if a dialog overflows at 4× 或 以… sm全部-screen mod environment
- Can be disabled per subcl作为s 与 `autoScaleEnabled() = false`

## New wiki system 功能

 `embed:item` / `embed:items` / `embed:screen` / `embed:model` mechanisms used on this 页面:

| Syntax | Purpose |
|---|---|
| `embed:item id=<modid:itemid> size=N` | ItemStack rendering, just 例如 an inven以ry slot |
| `embed:model id=<itemid> size=N rotate=true` | 3D 显示 of a BlockItem (au以-rotation) |
| `embed:screen id=<screen-id>` | Display a captured V3 screen (au以-switches 以  current language) |

GUI 截图 are au以-generated on login, so you can see everything in  wiki 与out opening  screens.  
After a language change, run `/tsu-wiki-prebuild` 以 regenerate  captures 用于  language.

## Next 页面s 以 read

- [管理用计算机 概述](management-computer/overview.md)
- [铁路管理方块](railway-management.md)
- [电气化系统](electrification/pantograph.md)
- [海报管理方块](poster-management.md)
