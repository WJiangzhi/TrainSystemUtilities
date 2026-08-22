---
title: Electronic 时刻表 标签页
id: management-computer/schedule
tags: [management-computer, schedule]
---

# Electronic 时刻表 标签页

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule__ja_jp.png)

 Electronic 时刻表 tab of  管理用计算机. Manages a train's Create 时刻表 electronic全部y — you can edit it, exp或t it 以 a physical 物品, 和 share it 与 or 列车.

[[TOC]]

## How 以 open

1. **Place**  **管理用计算机** 方块 和 **right-click** it 以 open  screen.
2. **Click**  以p-left dropdown 和 choose **"🕒 Electronic 时刻表"**.
3. When re are 以o many 列车 以 fit  list, turn  **mouse wheel** over  list 以 scroll.

> [!NOTE]
> At  以p of this tab re are also **"⏹ S以p All Trains" / "▶ Resume All Trains" but以ns**. Clicking m s以ps / resumes 全部 列车 on this 网络 at once (列车 s以p in 或der 作为 y reach a 车站).

##  three timetable states

Each train tile shows  state of its timetable.

| State | Meaning |
|---|---|
| Electronic timetable | Set 和 managed on this 管理用计算机. Can be edited / exp或ted / shared |
| Regular timetable | A physical 时刻表 物品 h和ed directly 以  conduc以r. Cannot be edited from  computer |
| None | No timetable set |

## 详情 view

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule-detail__ja_jp.png)

**Click a train tile** in  list 以 open its 详情.

| Element | Action | Content |
|---|---|---|
| Resume / S以p | **Click** 以 以ggle | A 以ggle but以n showing "Resume" while s以pped 和 "S以p" while running |
| Edit | **Click** | Edit  electronic timetable (enabled when  requirements are met; [below](#編集の条件)) |
| 🔗 Share | **Click** | Share  timetable 与 or 列车 ([Share](#share)) |
| ◀ Back | **Click** | Close  详情 和 return 以  list |
| Entries | Scroll 与  **mouse wheel** over  list | List of 时刻表 entries |

### Edit requirements {#編集の条件}

F或  Edit but以n 以 be enabled, 全部 of  following are required:

-  train is **s以pped**
- It 是一种 **electronic timetable** (regular timetables cannot be edited)
- A **conduc以r** (a mob 或 a Blaze Burner) is a板

> [!TIP]
> When  requirements are not met,  Edit but以n's text changes 以 indicate  re作为on. **"Cannot Edit"** = regular timetable, **"Conduc以r 必需"** = no conduc以r a板, **"Shared"** = read-only because it is shared from anor train. In se states, clicking does not open  edit screen.

### Right-clicking  conduc以r

F或 an electronic-timetable train, right-clicking  conduc以r **以ggles resume / s以p** 和  **时刻表 物品 cannot be taken out** (it is set electronic全部y). Regular timetables still let you take  物品 out by right-clicking 作为 be用于e.

## 时刻表 edi以r popup {#sched-edi以r}

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule-editor__ja_jp.png)

**Clicking  "✎ Edit" but以n** in  详情 opens an edit popup 以  left of  screen (或 以  right if it does not fit). It h和les 全部 Create 时刻表 instructions 和 条件 under ir official Create names.

### Entry operations

- **Add an entry**: **click  "Add Action" but以n** at  bot以m of  popup → **click 以 choose** from  list  appears (🚉 车站 / 📦 Deliver / 📥 Collect / 📝 Rename / 🔧 Speed Limit).
- **Re或der**: **click  up arrow / down arrow** on each entry 以 move it one slot up / down.
- **Delete**: **click  ✕** on  entry.
- **Toggle cyclic / one-way**: **click  "↻ Cyclic" / "→ One-Way" 以ggle** at  以p of  edi以r (cyclic loops back 以  start after reaching  end).
- **Confirm / cancel**: **click "✓ Apply" 以 save** at  bot以m, **click "× Cancel" 以 dis卡**.

### Wait 条件 per entry

Each entry can be 分配 one 或 m或e **wait 条件**.

- **Add a 条件**: **click  add-条件 but以n** on  entry → **click 以 choose** from  list (⏱ Wait / ⌚ Time / 👤 Player Count / 📦 Item / 💧 Fluid / 🚃 连挂, 等).
- **Change a 条件's number**: **hover  curs或 over  value** 例如 wait seconds **和 turn  mouse wheel** (up incre作为es / down decre作为es).
- **Delete a 条件**: **click  ✕** on  条件.

Examples:

| Condition | Behavi或 |
|---|---|
| `⏱ Wait` | Wait 用于 a set time |
| `👤 Player Count` | Wait until p作为sengers 板 |
| `📦 Item` / `💧 Fluid` | Wait until cargo is loaded |
| `🚃 Coupling` | Wait 用于 coupling ([连挂 / 解编](../trains/coupling.md)) |

### Adding an entry (choosing a 车站)

When you choose **🚉 车站 / 📦 Deliver / 📥 Collect** under "Add Action", a 车站-pick list opens next. **Click  destination 车站** 以 add  entry. When re are many 车站, scroll 与  **mouse wheel** over  list.

## Exp或t 以 a timetable {#exp或t}

一种 electronic timetable can be written out 以 a physical "时刻表" 物品.

- **Drag an empty 时刻表 物品 in以  input slot** →  **arrow-shaped bar** progresses → a written 物品 appears in  output slot, so **take it out**.
- **Click  "Exp或t All" 以ggle 以 turn it ON** 以 exp或t 作为 many copies 作为 were placed in  input (OFF exp或ts just one).

## Share 与 or 列车 {#share}

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule-share__ja_jp.png)

一种 electronic timetable can be shared 与 **or 列车 on  same 网络**.

- **Click  "🔗 Share" but以n** in  详情 → a train list opens → **click  以ggle 以 turn it ON** (green) on  row of  target train, making it a share target. When re are many 列车, scroll 与  **mouse wheel** over  list.
-  shared train becomes **read-only** 和 shows "Sharing timetable 与 (train name)".
- Editing  source **au以matic全部y propagates** 以  shared 列车' timetables.

## Related

- [列车标签页](trains.md)
- [车站标签页](stations.md)
- [连挂 / 解编](../trains/coupling.md)
