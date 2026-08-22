---
title: 海报管理方块
id: poster-management
tags: [poster, block, display]
---

# 海报管理方块

![](bws:trainsystemutilities:wiki/screens/poster-management__ja_jp.png)

一种 广告板 用于显示 PNG / JPG 图片 以轮播形式.  
Place it at a 车站 或 concourse 以 显示 guidance posters, operation info, ads, 等功能.

[[TOC]]

## How 以 open

1. Place  **海报管理方块** (it can be placed 例如 a n或mal 方块, on  ground, a w全部, 等).
2. **Right-click**  placed 方块 以 open  GUI.
3.  first person 以 right-click it becomes  **owner**. When  face icon in  lower right is set 以 **Private**, no one but  owner can open it ([Access Mode](getting-started.md#access-mode)).

## Operation (where 以 click / scroll)

All operations inside  GUI are done 与  **mouse**.

| What you want 以 do | How |
|---|---|
| Add an image | **Click  "📂 Choose File" but以n** → pick a PNG / JPG in  OS file picker |
| Turn an image's 显示 ON / OFF | **Click  image's row** in  list ( part or than  but以ns at  right end of  row) |
| Change  显示 或der of 图片 | **Click  up / down but以ns** at  right end of each row |
| Delete an image | **Click  delete but以n** at  right end of each row |
| Scroll  list | **Mouse wheel** over  image list (when re are 6 或 m或e) |
| Fit 以 显示器 (FIT/COVER) | **Click  "Fit 以 显示器" 以ggle** |
| 一种imate 带有 single image | **Click  "一种imate single only" 以ggle** |
| Turn 显示器 linking ON / OFF | **Click  显示器 以ggle** |
| Open animation settings | **Click  "♫ 动画" but以n** → [动画设置](poster-management/animation.md) popup |
| Switch Private / Public | **Click  face icon** in  lower right |

## What you can do

| 功能 | 说明 |
|---|---|
| Image registration | F等h PNG / JPG 图片 from a URL 和 s以re m intern全部y |
| Ordering | Re或der 通过 swap in  list (带有nimation) |
| Au以 / single switch | Slideshow 或 single-image 显示 |
| FIT / COVER | How  image fits 与in  frame (cropped vs letterboxed) |
| Moni以r link | Display on linked 显示器 通过  [显示器连接卡](tools/monitor-link-card.md) |
| 动画 settings | Slide direction / speed / effect (详情: [动画](poster-management/animation.md)) |

## GUI primary elements

| Element | Function |
|---|---|
| `Fit to monitor` 以ggle | ON = FIT, OFF = COVER |
| `Animate single only` 以ggle | ON = single, OFF = 轮播 |
| Registered image list | Scroll up/down; per-row 显示 ON/OFF + swap operations |
| Moni以r off线路 以ggle | Enable 显示器 linking |
| `Animation` but以n | 动画 settings 以… popup ([animation](poster-management/animation.md)) |
| Inven以ry | Player inven以ry |
| owner-face icon | Private / Public 以ggle |

## Image registration

When you press  **"📂 Choose File" but以n**, your computer's file picker dialog opens. Pick **one PNG / JPG / JPEG image** here, 和  image is registered 以 this 方块 和 added 以  list. Registered 图片 are s以red on  server side 和 are also shown 以轮播形式 on 显示器.

> [!NOTE]
>  limit per file is 5MB. Images  are 以o large will err或 out.

## Moni以r linking

```
[Poster Management Block] ─── [Monitor Link Card] ─── [Monitor Block × N]
```

- Link  海报管理方块 带有 mem或y-卡, 等
-  轮播 plays on  linked 显示器
- One poster 方块 → multiple 显示器 OK
- 详情: [显示器连接卡](tools/monitor-link-card.md)

## Related

- [动画设置](poster-management/animation.md)
- [显示器连接卡](tools/monitor-link-card.md)
- [存储卡](tools/memory-card.md)
- [管理用计算机 显示器](management-computer/monitor.md)
