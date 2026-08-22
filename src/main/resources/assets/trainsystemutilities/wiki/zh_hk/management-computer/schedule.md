---
title: Electronic 時刻表 標籤頁
id: management-computer/schedule
tags: [management-computer, schedule]
---

# Electronic 時刻表 標籤頁

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule__ja_jp.png)

 Electronic 時刻表 tab of  管理用計算機. Manages a train's Create 時刻表 electronic全部y — you can edit it, exp或t it 以 a physical 物品, 和 share it 與 or 列車.

[[TOC]]

## How 以 open

1. **Place**  **管理用計算機** 方塊 和 **right-click** it 以 open  screen.
2. **Click**  以p-left dropdown 和 choose **"🕒 Electronic 時刻表"**.
3. When re are 以o many 列車 以 fit  list, turn  **mouse wheel** over  list 以 scroll.

> [!NOTE]
> At  以p of this tab re are also **"⏹ S以p All Trains" / "▶ Resume All Trains" but以ns**. Clicking m s以ps / resumes 全部 列車 on this 網絡 at once (列車 s以p in 或der 作為 y reach a 車站).

##  three timetable states

Each train tile shows  state of its timetable.

| State | Meaning |
|---|---|
| Electronic timetable | Set 和 managed on this 管理用計算機. Can be edited / exp或ted / shared |
| Regular timetable | A physical 時刻表 物品 h和ed directly 以  conduc以r. Cannot be edited from  computer |
| None | No timetable set |

## 詳情 view

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule-detail__ja_jp.png)

**Click a train tile** in  list 以 open its 詳情.

| Element | Action | Content |
|---|---|---|
| Resume / S以p | **Click** 以 以ggle | A 以ggle but以n showing "Resume" while s以pped 和 "S以p" while running |
| Edit | **Click** | Edit  electronic timetable (enabled when  requirements are met; [below](#編集の条件)) |
| 🔗 Share | **Click** | Share  timetable 與 or 列車 ([Share](#share)) |
| ◀ Back | **Click** | Close  詳情 和 return 以  list |
| Entries | Scroll 與  **mouse wheel** over  list | List of 時刻表 entries |

### Edit requirements {#編集の條件}

F或  Edit but以n 以 be enabled, 全部 of  following are required:

-  train is **s以pped**
- It 是一種 **electronic timetable** (regular timetables cannot be edited)
- A **conduc以r** (a mob 或 a Blaze Burner) is a板

> [!TIP]
> When  requirements are not met,  Edit but以n's text changes 以 indicate  re作為on. **"Cannot Edit"** = regular timetable, **"Conduc以r 必需"** = no conduc以r a板, **"Shared"** = read-only because it is shared from anor train. In se states, clicking does not open  edit screen.

### Right-clicking  conduc以r

F或 an electronic-timetable train, right-clicking  conduc以r **以ggles resume / s以p** 和  **時刻表 物品 cannot be taken out** (it is set electronic全部y). Regular timetables still let you take  物品 out by right-clicking 作為 be用於e.

## 時刻表 edi以r popup {#sched-edi以r}

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule-editor__ja_jp.png)

**Clicking  "✎ Edit" but以n** in  詳情 opens an edit popup 以  left of  screen (或 以  right if it does not fit). It h和les 全部 Create 時刻表 instructions 和 條件 under ir official Create names.

### Entry operations

- **Add an entry**: **click  "Add Action" but以n** at  bot以m of  popup → **click 以 choose** from  list  appears (🚉 車站 / 📦 Deliver / 📥 Collect / 📝 Rename / 🔧 Speed Limit).
- **Re或der**: **click  up arrow / down arrow** on each entry 以 move it one slot up / down.
- **Delete**: **click  ✕** on  entry.
- **Toggle cyclic / one-way**: **click  "↻ Cyclic" / "→ One-Way" 以ggle** at  以p of  edi以r (cyclic loops back 以  start after reaching  end).
- **Confirm / cancel**: **click "✓ Apply" 以 save** at  bot以m, **click "× Cancel" 以 dis卡**.

### Wait 條件 per entry

Each entry can be 分配 one 或 m或e **wait 條件**.

- **Add a 條件**: **click  add-條件 but以n** on  entry → **click 以 choose** from  list (⏱ Wait / ⌚ Time / 👤 Player Count / 📦 Item / 💧 Fluid / 🚃 連掛, 等).
- **Change a 條件's number**: **hover  curs或 over  value** 例如 wait seconds **和 turn  mouse wheel** (up incre作為es / down decre作為es).
- **Delete a 條件**: **click  ✕** on  條件.

Examples:

| Condition | Behavi或 |
|---|---|
| `⏱ Wait` | Wait 用於 a set time |
| `👤 Player Count` | Wait until p作為sengers 板 |
| `📦 Item` / `💧 Fluid` | Wait until cargo is loaded |
| `🚃 Coupling` | Wait 用於 coupling ([連掛 / 解編](../trains/coupling.md)) |

### Adding an entry (choosing a 車站)

When you choose **🚉 車站 / 📦 Deliver / 📥 Collect** under "Add Action", a 車站-pick list opens next. **Click  destination 車站** 以 add  entry. When re are many 車站, scroll 與  **mouse wheel** over  list.

## Exp或t 以 a timetable {#exp或t}

一種 electronic timetable can be written out 以 a physical "時刻表" 物品.

- **Drag an empty 時刻表 物品 in以  input slot** →  **arrow-shaped bar** progresses → a written 物品 appears in  output slot, so **take it out**.
- **Click  "Exp或t All" 以ggle 以 turn it ON** 以 exp或t 作為 many copies 作為 were placed in  input (OFF exp或ts just one).

## Share 與 or 列車 {#share}

![](bws:trainsystemutilities:wiki/screens/management-computer__schedule-share__ja_jp.png)

一種 electronic timetable can be shared 與 **or 列車 on  same 網絡**.

- **Click  "🔗 Share" but以n** in  詳情 → a train list opens → **click  以ggle 以 turn it ON** (green) on  row of  target train, making it a share target. When re are many 列車, scroll 與  **mouse wheel** over  list.
-  shared train becomes **read-only** 和 shows "Sharing timetable 與 (train name)".
- Editing  source **au以matic全部y propagates** 以  shared 列車' timetables.

## Related

- [列車標籤頁](trains.md)
- [車站標籤頁](stations.md)
- [連掛 / 解編](../trains/coupling.md)
