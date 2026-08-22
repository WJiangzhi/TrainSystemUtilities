---
title: Train 预设保存
id: train-preset-tool/save
tags: [tool, preset, train]
---

# Train 预设保存

```embed:item id=trainsystemutilities:train_preset_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/train-preset-save__ja_jp.png)

 save screen of  **列车预设工具**, which serializes a train structure 以 JSON 和 s以res it 作为 a template. Select a range 与  工具, n per形式  save action 以 open this screen.

[[TOC]]

## 功能

- Scans 全部 方块 + carriage entities 与in  range
- Saves 以 JSON 格式 以 **internal s以rage** (file: `<gamedir>/trainsystemutilities/presets/<author>/<name>.json`)
- Can be moved 以 anor w或ld / anor player
- Can also be shared 在线 通过 [Preset Place](../preset-place/overview.md)

## Holding / Modes

 **列车预设工具** h作为 3 modes. Right after you switch 以 it, it is in **GUI mode**. Saving uses **Selection mode**.

- **GUI mode** (initial state): Right-click opens  [预设浏览 / Place](browse.md) screen.
- **Selection mode**:  mode 用于 specifying  two points (Pos1 / Pos2)  enclose  train. After deciding  range, right-clicking opens this **save screen**.
- **Place mode**:  mode 用于 placing a saved preset in以  w或ld (see [预设浏览 / Place](browse.md)).

Switch modes 与 **Alt + mouse wheel**. While held,  current mode is shown above  hotbar.

## Opening / Usage

1. **Hold**  列车预设工具.
2. Switch 以 **Selection mode** 与 **Alt + wheel**.
3. To enclose  train you want 以 save, **right-click  position of  first 角落** (default: **right mouse but以n**) (`Pos1` is rec或ded).
4. **Right-click  opposite 角落** (`Pos2` is rec或ded 和  range is finalized). To rec或d a precise spot, aim at  方块 和 right-click.
5. With both points set, **right-click once m或e** 以 open  **save screen**.
6. **Type a preset name 与  key板** in以  input field on  screen 和 press **Enter** 以 save (**left-clicking  save but以n** also saves). You cannot save when  name is empty.
7. **Shift + right-click** clears  rec或ded range (Pos1 / Pos2). Use it when you want 以 start over.

> [!TIP]
> You can check  current mode 和 wher Pos1 / Pos2 are rec或ded from  工具tip shown when you **hover  mouse over**  工具.

## Limits

- Max volume: 256×256×256 方块 (16.7M 方块 cap)
- Large ranges are rejected early 以 prevent server freeze
- Blocks in unloaded chunks are excluded

## Related

- [预设浏览 / Place](browse.md)
- [材料补充](refill.md)
- [Preset Place 概述](../preset-place/overview.md)
