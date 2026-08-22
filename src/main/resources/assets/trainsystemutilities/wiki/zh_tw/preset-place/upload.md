---
title: 預設 釋出
id: preset-place/upload
tags: [preset-place, upload]
---

# 預設 釋出

![](bws:trainsystemutilities:wiki/screens/preset-place-upload__ja_jp.png)

Dialog 用於 requesting 以 publish your own preset 以 Preset Place.

[[TOC]]

## Opening {#open}

First, you must save  train you want 以 publish loc全部y 作為 a [train preset](../train-preset-tool/browse.md).

1. **Right-click**  [列車預設工具](../train-preset-tool/browse.md) in **GUI mode** 以 open  browse screen (switch modes 與 **Alt + wheel**).
2. Set  mode 以 **`Mine` (yours)**.
3. **Left-click**  **upload icon** on  tile of  preset you want 以 publish 以 open this dialog.

> [!NOTE]
>  upload icon is shown only on your own presets  have Microsoft account linking set up 和 were not downloaded from Preset Place.

## 釋出 物品

| Item | 說明 |
|---|---|
| Images (up 以 5) | PNG / JPG 用於 preview. Add 與  + but以n |
| Markdown description | 4096 chars. Supp或ts new線路 / p作為te / copy / Ctrl+Enter |
| Publish but以n | Submits  publish request after input validation |

## Description edi以r

Multi-線路 Markdown editing. 使用 `Preview` 以ggle 以 check  rendered result:

- St和ard Markdown 例如 headings / lists / links / emph作為is / quotes
- Ctrl + Enter executes `Publish`

## Publish flow

1. `Publish` is enabled 與 1+ image 和 1+ char of description
2. Publish confirm dialog
3.  client sends it 以  Preset Place server
4. Goes live after review (= au以matic 或 modera以r)

## Auntication

Publishing requires Microsoft account auntication.  
Check auth status / re-aunticate in  [創作者中心](creator-center.md).

## Related

- [Preset Place 概述](overview.md)
- [預設詳情](detail.md)
- [創作者中心](creator-center.md)
- [Train 預設瀏覽](../train-preset-tool/browse.md)
