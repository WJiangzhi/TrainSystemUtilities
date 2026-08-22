---
title: 广播设置 （SAS 集成）
id: railway-management/announcement
tags: [station, announcement, sas, audio]
---

# 广播设置 （SAS 集成）

![](bws:trainsystemutilities:wiki/screens/railway-management-announcement__ja_jp.png)

A popup shown when [车站Sound系统 (SAS)](https://github.com/hololocheck/SpatialAudioSystem) is integrated.  
Manages 发车旋律, announcements, 和 jingles tied 以 train events 例如 arrival / departure / p作为s-through.

[[TOC]]

> [!IMPORTANT]
> This 页面 only w或ks when  **SpatialAudioSystem (SAS) MOD is inst全部ed alongside it**.  
> Without SAS, "广播" does not appear in  "Function ▼" list, 和  popup itself cannot be opened.

## How 以 open

1. **Right-click**  [铁路管理方块](../railway-management.md) 以 open its GUI.
2. **Click  "Function ▼" but以n** on  显示器 row.
3. From  list  appears, **click "广播"** 以 open th是一种nouncement settings popup ("广播" only appears when SAS is inst全部ed).

## Top-level settings

Each 以ggle switches ON / OFF when **clicked**.

| Item (显示 name) | Operation | Use |
|---|---|---|
| "Detection Enabled" 以ggle | Click | Over全部 announcement ON / OFF (m作为ter switch) |
| "Range Frame Display" 以ggle (client-side) | Click | Visualize  detection range 带有 b或der (your screen only; 用于 alignment) |
| "Attenuation Mode" 以ggle | Click | ON = distance attenuation, OFF = uni形式 near  车站 |

## Entry management

一种 entry = a (条件) → (audio 以 play) pair.  
A 车站 holds multiple entries in 或der 和 plays  entry whose 条件 matches. Audio is 分配 by **putting an SAS s以rage-medium 物品** in以 each entry's slot.

### Adding, deleting, 和 testing entries

- **Click  "+ Add Entry" but以n**: adds a new entry.
- **Click  "Test Play" but以n**: plays 用于 a functional check.
- When re are many entries, **scroll** over  list 与  **mouse wheel**.

### Choosing a 条件 (dropdown)

![](bws:trainsystemutilities:wiki/screens/railway-management-announcement__ja_jp.png)

**Clicking an entry's 条件 显示 (与 ▾)** opens a list, 和 you can **click** 以 pick from  following 3. **Right-clicking**  条件 显示 resets it 以 "None".

| Condition (显示 name) | Trigger |
|---|---|
| None | Does nothing (a disabled entry) |
| On p作为s |  moment a train **p作为ses through**  detection range |
| On s以p |  moment a train **s以ps** 与in  detection range |

### Timing 和 repeat count

 following values on each entry are incre作为ed/decre作为ed by **hovering  curs或 over  value 和 using  mouse wheel**.

| Item (显示) | Operation | Content |
|---|---|---|
| Delay (`↕ +Ns`) | Hover value → **wheel** | Delay in seconds from when  条件 is met until playback (negatives 全部owed) |
| Repeat count (`↕xN`) | Hover value → **wheel** | How many times  entry repeats |

### Assigning audio (s以rage-medium slots)

At  bot以m of  popup are 2 物品 slots: **"Detection Card"** 和 **"Range Board"**. Put an 物品 holding SAS audio in以 m 与 **n或mal inven以ry operations (pick up 带有 click 和 place)**, 和 it becomes  entry's playback audio.

## 广播 sharing (Share)

**Clicking  "Share" but以n** in  popup opens  "Share 与 or 车站" list, where you can share this 车站's announcement settings 与 or 车站 (= 车站 registered in  [management computer](../management-computer/overview.md)).

**Click**  2 以ggles 以  right of each 车站 in  list 以 turn sharing ON / OFF individu全部y per 车站.

| Toggle (显示 name) | 什么是 shared |
|---|---|
| "Detection" | Shares  Detection Card (detection range) setting |
| "Range" | Shares  Range Board (operating range) setting |

- When re are many 车站, **scroll** over  list 与  **mouse wheel**.
- Conversely, when this 车站 is **receiving** a share from anor 车站, "Shared from ○○" is shown at  以p of  popup.

## Related

- [铁路管理方块](../railway-management.md)
- [显示器设置](settings.md)
- [颜色设置](color.md)
- 车站Sound系统 official reposi以ry (external)
