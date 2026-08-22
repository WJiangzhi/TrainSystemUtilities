---
title: 列车检测卡
id: tools/train-detection-card
tags: [tool, item, detection]
---

# 列车检测卡

```embed:item id=trainsystemutilities:train_detection_card size=48 label=true
```

A **held auxiliary 卡**  rec或ds **a single specific point** 在…上 轨道 作为 a "place  reacts when a train p作为ses."  
 rec或ded point is used in  [铁路管理方块](../railway-management.md)'s [SAS 广播](../railway-management/announcement.md) 作为 a trigger 以 "play an announcement when a train p作为ses this point."

[[TOC]]

## Holding / usage

This 卡 h作为 no dedicated settings GUI. You just **hold it, right-click a 轨道, 和 rec或d a point.**  详情ed 条件 (target train, announcement content, 等) are set afterward in  **railway management 方块's GUI**.

1. **Put  列车检测卡 on your hotbar 和 hold it.**
2. **Right-click  轨道 方块 (Create's 轨道)** you want 以 rec或d (by default,  **right mouse but以n**).
   - Right-clicking something or than a 轨道 shows a message 以  effect of "This is not a 轨道" 和 nothing is rec或ded.
3. On a successful rec或d, "Point rec或ded (co或dinates)" is shown at  bot以m of  screen.
4.  rec或ded co或dinates can be checked in  **工具tip** when you **hover**  卡.
5. **Shift + right-click** (right-click while sneaking) **clears**  rec或ded point.

> [!NOTE]
> This 卡 only remembers **a single point on  轨道**. 详情ed 条件 例如 a "detection range (radius)," "target-train filtering," 或 "trigger-timing type" **are not on  卡.**  
> Those are adjusted on  [SAS 广播设置](../railway-management/announcement.md) GUI after you insert  rec或ded 卡 in以  railway management 方块.

## Operation summary

| Operation | What happens |
|---|---|
| **Right-click** a 轨道 | Rec或d  轨道 point 作为 a detection point |
| **Shift + right-click** | Clear  rec或ded point |
| **Hover** over  卡 | Check  rec或ded co或dinates in  工具tip |

## Usage 与  铁路管理方块

 rec或ded 卡 becomes an actual trigger through  following flow.

1. With  steps above, rec或d  轨道 point where you want an announcement 以 play.
2. Right-click 以 open  [铁路管理方块](../railway-management.md), n open  [SAS 广播设置](../railway-management/announcement.md).
3. In  announcement settings, **insert this rec或ded 卡 in以  detection-卡 slot**.
4. Now, when a train p作为ses  rec或ded 轨道 point,  configured announcement plays.

## 集成

- Used 作为  playback trigger (p作为s-through detection point) 用于 [SAS 广播](../railway-management/announcement.md)

## Related

- [铁路管理方块](../railway-management.md)
- [SAS 广播设置](../railway-management/announcement.md)
- [车站范围指定工具](station-range-tool.md)
