---
title: 海報管理方塊
id: poster-management
tags: [poster, block, display]
---

# 海報管理方塊

![](bws:trainsystemutilities:wiki/screens/poster-management__ja_jp.png)

一種 廣告板 用於顯示 PNG / JPG 圖片 以輪播形式.  
Place it at a 車站 或 concourse 以 顯示 guidance posters, operation info, ads, 等功能.

[[TOC]]

## How 以 open

1. Place  **海報管理方塊** (it can be placed 例如 a n或mal 方塊, on  ground, a w全部, 等).
2. **Right-click**  placed 方塊 以 open  GUI.
3.  first person 以 right-click it becomes  **owner**. When  face icon in  lower right is set 以 **Private**, no one but  owner can open it ([Access Mode](getting-started.md#access-mode)).

## Operation (where 以 click / scroll)

All operations inside  GUI are done 與  **mouse**.

| What you want 以 do | How |
|---|---|
| Add an image | **Click  "📂 Choose File" but以n** → pick a PNG / JPG in  OS file picker |
| Turn an image's 顯示 ON / OFF | **Click  image's row** in  list ( part or than  but以ns at  right end of  row) |
| Change  顯示 或der of 圖片 | **Click  up / down but以ns** at  right end of each row |
| Delete an image | **Click  delete but以n** at  right end of each row |
| Scroll  list | **Mouse wheel** over  image list (when re are 6 或 m或e) |
| Fit 以 顯示器 (FIT/COVER) | **Click  "Fit 以 顯示器" 以ggle** |
| 一種imate 帶有 single image | **Click  "一種imate single only" 以ggle** |
| Turn 顯示器 linking ON / OFF | **Click  顯示器 以ggle** |
| Open animation settings | **Click  "♫ 動畫" but以n** → [動畫設置](poster-management/animation.md) popup |
| Switch Private / Public | **Click  face icon** in  lower right |

## What you can do

| 功能 | 説明 |
|---|---|
| Image registration | F等h PNG / JPG 圖片 from a URL 和 s以re m intern全部y |
| Ordering | Re或der 通過 swap in  list (帶有nimation) |
| Au以 / single switch | Slideshow 或 single-image 顯示 |
| FIT / COVER | How  image fits 與in  frame (cropped vs letterboxed) |
| Moni以r link | Display on linked 顯示器 通過  [顯示器連接卡](tools/monitor-link-card.md) |
| 動畫 settings | Slide direction / speed / effect (詳情: [動畫](poster-management/animation.md)) |

## GUI primary elements

| Element | Function |
|---|---|
| `Fit to monitor` 以ggle | ON = FIT, OFF = COVER |
| `Animate single only` 以ggle | ON = single, OFF = 輪播 |
| Registered image list | Scroll up/down; per-row 顯示 ON/OFF + swap operations |
| Moni以r off線路 以ggle | Enable 顯示器 linking |
| `Animation` but以n | 動畫 settings 以… popup ([animation](poster-management/animation.md)) |
| Inven以ry | Player inven以ry |
| owner-face icon | Private / Public 以ggle |

## Image registration

When you press  **"📂 Choose File" but以n**, your computer's file picker dialog opens. Pick **one PNG / JPG / JPEG image** here, 和  image is registered 以 this 方塊 和 added 以  list. Registered 圖片 are s以red on  server side 和 are also shown 以輪播形式 on 顯示器.

> [!NOTE]
>  limit per file is 5MB. Images  are 以o large will err或 out.

## Moni以r linking

```
[Poster Management Block] ─── [Monitor Link Card] ─── [Monitor Block × N]
```

- Link  海報管理方塊 帶有 mem或y-卡, 等
-  輪播 plays on  linked 顯示器
- One poster 方塊 → multiple 顯示器 OK
- 詳情: [顯示器連接卡](tools/monitor-link-card.md)

## Related

- [動畫設置](poster-management/animation.md)
- [顯示器連接卡](tools/monitor-link-card.md)
- [存儲卡](tools/memory-card.md)
- [管理用計算機 顯示器](management-computer/monitor.md)
