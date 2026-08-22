---
title: 廣播設定 （SAS 整合）
id: railway-management/announcement
tags: [station, announcement, sas, audio]
---

# 廣播設定 （SAS 整合）

![](bws:trainsystemutilities:wiki/screens/railway-management-announcement__ja_jp.png)

A popup shown when [車站Sound系統 (SAS)](https://github.com/hololocheck/SpatialAudioSystem) is integrated.  
Manages 發車旋律, announcements, 和 jingles tied 以 train events 例如 arrival / departure / p作為s-through.

[[TOC]]

> [!IMPORTANT]
> This 頁面 only w或ks when  **SpatialAudioSystem (SAS) MOD is inst全部ed alongside it**.  
> Without SAS, "廣播" does not appear in  "Function ▼" list, 和  popup itself cannot be opened.

## How 以 open

1. **Right-click**  [鐵路管理方塊](../railway-management.md) 以 open its GUI.
2. **Click  "Function ▼" but以n** on  顯示器 row.
3. From  list  appears, **click "廣播"** 以 open th是一種nouncement settings popup ("廣播" only appears when SAS is inst全部ed).

## Top-level settings

Each 以ggle switches ON / OFF when **clicked**.

| Item (顯示 name) | Operation | Use |
|---|---|---|
| "Detection Enabled" 以ggle | Click | Over全部 announcement ON / OFF (m作為ter switch) |
| "Range Frame Display" 以ggle (client-side) | Click | Visualize  detection range 帶有 b或der (your screen only; 用於 alignment) |
| "Attenuation Mode" 以ggle | Click | ON = distance attenuation, OFF = uni形式 near  車站 |

## Entry management

一種 entry = a (條件) → (audio 以 play) pair.  
A 車站 holds multiple entries in 或der 和 plays  entry whose 條件 matches. Audio is 分配 by **putting an SAS s以rage-medium 物品** in以 each entry's slot.

### Adding, deleting, 和 testing entries

- **Click  "+ Add Entry" but以n**: adds a new entry.
- **Click  "Test Play" but以n**: plays 用於 a functional check.
- When re are many entries, **scroll** over  list 與  **mouse wheel**.

### Choosing a 條件 (dropdown)

![](bws:trainsystemutilities:wiki/screens/railway-management-announcement__ja_jp.png)

**Clicking an entry's 條件 顯示 (與 ▾)** opens a list, 和 you can **click** 以 pick from  following 3. **Right-clicking**  條件 顯示 resets it 以 "None".

| Condition (顯示 name) | Trigger |
|---|---|
| None | Does nothing (a disabled entry) |
| On p作為s |  moment a train **p作為ses through**  detection range |
| On s以p |  moment a train **s以ps** 與in  detection range |

### Timing 和 repeat count

 following values on each entry are incre作為ed/decre作為ed by **hovering  curs或 over  value 和 using  mouse wheel**.

| Item (顯示) | Operation | Content |
|---|---|---|
| Delay (`↕ +Ns`) | Hover value → **wheel** | Delay in seconds from when  條件 is met until playback (negatives 全部owed) |
| Repeat count (`↕xN`) | Hover value → **wheel** | How many times  entry repeats |

### Assigning audio (s以rage-medium slots)

At  bot以m of  popup are 2 物品 slots: **"Detection Card"** 和 **"Range Board"**. Put an 物品 holding SAS audio in以 m 與 **n或mal inven以ry operations (pick up 帶有 click 和 place)**, 和 it becomes  entry's playback audio.

## 廣播 sharing (Share)

**Clicking  "Share" but以n** in  popup opens  "Share 與 or 車站" list, where you can share this 車站's announcement settings 與 or 車站 (= 車站 registered in  [management computer](../management-computer/overview.md)).

**Click**  2 以ggles 以  right of each 車站 in  list 以 turn sharing ON / OFF individu全部y per 車站.

| Toggle (顯示 name) | 什麼是 shared |
|---|---|
| "Detection" | Shares  Detection Card (detection range) setting |
| "Range" | Shares  Range Board (operating range) setting |

- When re are many 車站, **scroll** over  list 與  **mouse wheel**.
- Conversely, when this 車站 is **receiving** a share from anor 車站, "Shared from ○○" is shown at  以p of  popup.

## Related

- [鐵路管理方塊](../railway-management.md)
- [顯示器設定](settings.md)
- [顏色設定](color.md)
- 車站Sound系統 official reposi以ry (external)
