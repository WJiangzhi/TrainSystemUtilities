---
title: 列車預設儲存
id: train-preset-tool/save
tags: [tool, preset, train]
---

# 列車預設儲存

```embed:item id=trainsystemutilities:train_preset_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/train-preset-save__ja_jp.png)

**列車預設工具**的儲存介面，可將列車結構序列化為 JSON 並作為模板儲存。用工具選定範圍後，執行儲存動作即可開啟此介面。

[[TOC]]

## 功能

- 掃描範圍內的所有方塊 + 車廂實體
- 以 JSON 格式儲存到**內部儲存**（檔案：`<gamedir>/trainsystemutilities/presets/<author>/<name>.json`）
- 可遷移到其他世界 / 其他玩家
- 也可透過 [Preset Place](../preset-place/overview.md) 線上分享

## 持有 / 模式

**列車預設工具**有 3 種模式。切換到該工具後即為 **GUI 模式**。儲存使用**選擇模式**。

- **GUI 模式**（初始狀態）：右鍵開啟[預設瀏覽 / 放置](browse.md)介面。
- **選擇模式**：用於指定圍住列車的兩個點（Pos1 / Pos2）的模式。確定範圍後右鍵即可開啟此**儲存介面**。
- **放置模式**：用於將已儲存的預設放入世界的模式（見[預設瀏覽 / 放置](browse.md)）。

用 **Alt + 滑鼠滾輪**切換模式。手持時，當前模式會顯示在快捷欄上方。

## 開啟 / 用法

1. **手持**列車預設工具。
2. 用 **Alt + 滾輪**切換到**選擇模式**。
3. 要圍住你想儲存的列車，請**右鍵第一個角的位置**（預設：**滑鼠右鍵**）（記錄 `Pos1`）。
4. **右鍵對角的另一個角**（記錄 `Pos2`，範圍就此確定）。要記錄精確位置，請瞄準該方塊並右鍵。
5. 兩個點都設定好後，**再次右鍵**即可開啟**儲存介面**。
6. 在介面的輸入框中**用鍵盤輸入預設名稱**，按 **Enter** 儲存（**左鍵儲存按鈕**也可儲存）。名稱為空時無法儲存。
7. **Shift + 右鍵**清除已記錄的範圍（Pos1 / Pos2）。想重新開始時使用。

> [!TIP]
> 將滑鼠**懸停**在工具上時，可從顯示的提示資訊中檢視當前模式以及 Pos1 / Pos2 是否已記錄。

## 限制

- 最大體積：256×256×256 方塊（上限 1670 萬方塊）
- 過大的範圍會被提前拒絕，以防伺服器卡死
- 未載入區塊內的方塊會被排除

## 相關

- [預設瀏覽 / 放置](browse.md)
- [材料補充](refill.md)
- [Preset Place 概述](../preset-place/overview.md)
