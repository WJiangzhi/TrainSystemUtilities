---
title: 快速開始
id: getting-started
tags: [tutorial, beginner]
---

# 快速開始

 entry 頁面 用於 underst和ing, step by step, "which GUI manages what" 和 "what happens when I press F1" when you first pick up Train系統 Utilities.

[[TOC]]

> [!NOTE]
> This MOD requires  **Create 1.21.1-compatible** version. It integrates closely 與 Create's 時刻表 / 車站 / 訊號 mechanisms.

## List of this MOD's GUIs

TSU's GUIs are broadly split in以 **"ones you open by right-clicking a 方塊"** 和 **"ones you use by holding an 物品"**. Operate 作為 shown in  "How 以 open" column below 以 open  GUI.

### Block GUIs (place, n right-click)

| GUI | How 以 open | 作用 |
|---|---|---|
| 管理用計算機 | Place  方塊 和 **right-click** it |  hub 用於 顯示器ing 和 configuring  whole 網路. Switch between  tab group below 以 use it |
| 鐵路管理方塊 | Place 在…上 車站 月臺 和 **right-click** | Per-車站 顯示 板 (arriving / next train / 車站 顯示器) |
| 海報管理方塊 | **Right-click**  方塊 | Slideshow 顯示 of PNG/JPG 圖片 |
| Ticket Machine | **Right-click**  方塊 | Choose a destinati在…上nd buy a ticket |

### 管理用計算機 tabs / sub-screens

Opened from  管理用計算機 透過 tab switching 或 but以ns.

| Screen | How 以 open | 作用 |
|---|---|---|
| 線路圖 / Trains / 時刻表 / 車站 / Ticket Machine / Line Symbols tabs | Switch 與  以p-left dropdown (顯示器) 或 tabs | List / settings 用於 each 功能 |
| Line 編號編輯器 | Line Symbols tab → **"＋ New"** / click an 現有 編號 | Edit a 編號's text / col或 / shape (built-in col或 picker) |
| 佈局編輯器 |  **"Layout"** but以n at  bot以m | Edit  arrangement of 顯示器 顯示 panels |
| 顏色設定 / Col或 Picker |  **"Col或"** but以n at  bot以m | Change  顯示器's col或 scheme |
| 時刻表 Edi以r | 時刻表 tab → select a tra以…nd edit | Edit / exp或t a Create 時刻表 |

### Item GUIs / 工具 (hold 和 use)

| Tool | How 以 open / operate | 作用 |
|---|---|---|
| 換乘查詢終端 | Hold it 和 **right-click** | Guidance on routes, travel times, 和 times between 車站 |
| 車站範圍指定工具 | Hold it, switch mode 與 **Alt+wheel**, right-click 以 designate | Create 車站 groups / link ticket machines 和 gates |
| 列車預設工具 | Hold it 和 **right-click** (settings) / place 透過 mode switch | Save 列車 以 JSON 格式, place m, refill materials |
| 連線工具 Tool | Hold it 和 **right-click** | Lay wires / 自定義 wire presets |
| Wire Pole Au以-Placement Tool | Hold it, configure 與 **Alt/Ctrl/Shift+wheel**, right-click 以 place | Au以matic全部y place wire poles in sequence |

### 電氣化系統 (方塊/devices)

| Device | 作用 |
|---|---|
| 受電弓 / wire / sub車站 / FE inverter | Supply FE / Create 能量 以 列車 透過 overhead wire (詳情: [電氣化系統](electrification/pantograph.md)) |

### On線路 sharing (Preset Place)

| Screen | How 以 open | 作用 |
|---|---|---|
| 預設 browse / 詳情 / upload / profile / crea以r center | From  列車預設工具's menu | On線路 sharing of your own train presets |

### 鐵路管理方塊 preview

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

### 連線工具 Tool preview

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

## 提示和 F1 {#hints-和-f1}

Turn ON  **Hint** 以ggle in  upper right of each GUI, 和 a brief descripti在…上ppears when you hover  mouse over a but以n / 物品.  
Press **F1** in  state, 和  wiki 跳轉s directly 以  description section 用於  功能 you are currently hovering.

> [!TIP]
> It helps 以 think of F1 not 作為 "a key  opens  wiki" but 作為 **a key  跳轉s 以  description of  功能**.
> Example: hover over  顯示器 以ggle 和 press F1 →  "顯示器" section opens directly.

### Usage flow

1. Turn  `Hint` 以ggle ON.
2. Move  curs或 on以  but以n / tab you want explained.
3. Press **F1**.
4. It au以matic全部y moves 以  wiki heading c或responding 以  功能.

## 一種 e作為y flow 以 learn first

1. In [管理用計算機 概述](management-computer/overview.md), get a gr作為p of which tab h和les what.
2. When you want 以 watch train operation, read  [列車標籤頁](management-computer/trains.md) 和 [時刻表標籤頁](management-computer/schedule.md).
3. When you want 以 或ganize  線路 編號 shown at 車站, read  [車站標籤頁](management-computer/stations.md) 和 [線路編號標籤頁](management-computer/line-symbols.md).
4. When you want 以 check  車站-side 顯示, read  [鐵路管理方塊](railway-management.md).
5. When you want 以 build image 顯示, read  [海報管理方塊](poster-management.md).
6. When you want 以 electrify 列車, read  [電氣化系統](electrification/pantograph.md).

> [!WARNING]
> F或 server operation, **Private mode** is essential. 其他 players may rewrite your 時刻表.
> As a rule, 管理用計算機s 在…上 main 線路 should be Private.

## Choosing an access mode {#access-mode}

You can switch  mode 與  face icon in  lower right of each GUI.

<詳情>
<summary>Difference between Private / Public</summary>

| Mode | Display | Setting changes | Use c作為e |
|---|---|---|---|
| Public | Blue-framed face | 一種yone can change | Cooperative operation / test w或ld |
| Private | Red-framed face | Only  placer | Main 線路 operation / multiplayer |

Creating 和 reading links 帶有 mem或y 卡 w或ks regardless of mode, but 以ggle operations 和 col或 settings are treated 作為 access-mode-gated.

</詳情>

## GUI au以-sizing

All V3 GUIs are au以matic全部y scaled down 以 match Minecraft's GUI scale (1×/2×/3×/4×) 和  screen size.

- ** b作為e線路 is GUI scale 2×** (= a 960×540 viewp或t at 1920×1080). All dialogs are designed 以 fit at this b作為e線路.
- Au以-shrinks (5% margin) if a dialog overflows at 4× 或 以… sm全部-screen mod environment
- Can be disabled per subcl作為s 與 `autoScaleEnabled() = false`

## New wiki system 功能

 `embed:item` / `embed:items` / `embed:screen` / `embed:model` mechanisms used on this 頁面:

| Syntax | Purpose |
|---|---|
| `embed:item id=<modid:itemid> size=N` | ItemStack rendering, just 例如 an inven以ry slot |
| `embed:model id=<itemid> size=N rotate=true` | 3D 顯示 of a BlockItem (au以-rotation) |
| `embed:screen id=<screen-id>` | Display a captured V3 screen (au以-switches 以  current language) |

GUI 截圖 are au以-generated on login, so you can see everything in  wiki 與out opening  screens.  
After a language change, run `/tsu-wiki-prebuild` 以 regenerate  captures 用於  language.

## Next 頁面s 以 read

- [管理用計算機 概述](management-computer/overview.md)
- [鐵路管理方塊](railway-management.md)
- [電氣化系統](electrification/pantograph.md)
- [海報管理方塊](poster-management.md)
