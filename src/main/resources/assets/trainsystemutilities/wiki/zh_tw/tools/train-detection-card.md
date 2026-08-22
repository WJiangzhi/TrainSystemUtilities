---
title: 列車檢測卡
id: tools/train-detection-card
tags: [tool, item, detection]
---

# 列車檢測卡

```embed:item id=trainsystemutilities:train_detection_card size=48 label=true
```

A **held auxiliary 卡**  rec或ds **a single specific point** 在…上 軌道 作為 a "place  reacts when a train p作為ses."  
 rec或ded point is used in  [鐵路管理方塊](../railway-management.md)'s [SAS 廣播](../railway-management/announcement.md) 作為 a trigger 以 "play an announcement when a train p作為ses this point."

[[TOC]]

## Holding / usage

This 卡 h作為 no dedicated settings GUI. You just **hold it, right-click a 軌道, 和 rec或d a point.**  詳情ed 條件 (target train, announcement content, 等) are set afterward in  **railway management 方塊's GUI**.

1. **Put  列車檢測卡 on your hotbar 和 hold it.**
2. **Right-click  軌道 方塊 (Create's 軌道)** you want 以 rec或d (by default,  **right mouse but以n**).
   - Right-clicking something or than a 軌道 shows a message 以  effect of "This is not a 軌道" 和 nothing is rec或ded.
3. On a successful rec或d, "Point rec或ded (co或dinates)" is shown at  bot以m of  screen.
4.  rec或ded co或dinates can be checked in  **工具tip** when you **hover**  卡.
5. **Shift + right-click** (right-click while sneaking) **clears**  rec或ded point.

> [!NOTE]
> This 卡 only remembers **a single point on  軌道**. 詳情ed 條件 例如 a "detection range (radius)," "target-train filtering," 或 "trigger-timing type" **are not on  卡.**  
> Those are adjusted on  [SAS 廣播設定](../railway-management/announcement.md) GUI after you insert  rec或ded 卡 in以  railway management 方塊.

## Operation summary

| Operation | What happens |
|---|---|
| **Right-click** a 軌道 | Rec或d  軌道 point 作為 a detection point |
| **Shift + right-click** | Clear  rec或ded point |
| **Hover** over  卡 | Check  rec或ded co或dinates in  工具tip |

## Usage 與  鐵路管理方塊

 rec或ded 卡 becomes an actual trigger through  following flow.

1. With  steps above, rec或d  軌道 point where you want an announcement 以 play.
2. Right-click 以 open  [鐵路管理方塊](../railway-management.md), n open  [SAS 廣播設定](../railway-management/announcement.md).
3. In  announcement settings, **insert this rec或ded 卡 in以  detection-卡 slot**.
4. Now, when a train p作為ses  rec或ded 軌道 point,  configured announcement plays.

## 整合

- Used 作為  playback trigger (p作為s-through detection point) 用於 [SAS 廣播](../railway-management/announcement.md)

## Related

- [鐵路管理方塊](../railway-management.md)
- [SAS 廣播設定](../railway-management/announcement.md)
- [車站範圍指定工具](station-range-tool.md)
