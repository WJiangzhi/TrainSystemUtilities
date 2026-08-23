---
title: 海报管理方块
id: poster-management
tags: [poster, block, display]
---

# 海报管理方块

![](bws:trainsystemutilities:wiki/screens/poster-management__ja_jp.png)

以轮播方式显示 PNG / JPG 图片的广告板。  
将其放置在车站或站厅，可用于显示导引海报、运营信息、广告等。

[[TOC]]

## 如何打开

1. 放置**海报管理方块**（可像普通方块一样放置在地上、墙上等）。
2. 对已放置的方块**右键**打开 GUI。
3. 第一个右键它的人成为**所有者**。当右下角脸形图标设为**私有**时，除所有者外无人能打开它（[访问模式](getting-started.md#access-mode)）。

## 操作（点击 / 滚动位置）

GUI 内的全部操作都通过**鼠标**完成。

| 想做的事 | 操作方法 |
|---|---|
| 添加图片 | **点击「📂 选择文件」按钮** → 在系统文件选择器中选取 PNG / JPG |
| 开启 / 关闭某张图片的显示 | **点击列表中该图片所在行**（行右端按钮以外的部分） |
| 更改图片显示顺序 | **点击每行右端的上 / 下按钮** |
| 删除图片 | **点击每行右端的删除按钮** |
| 滚动列表 | 在图片列表上**滚动鼠标滚轮**（图片达到 6 张及以上时） |
| 适配显示器（FIT/COVER） | **点击「适配显示器」开关** |
| 用单张图片做动画 | **点击「仅单张动画」开关** |
| 开启 / 关闭显示器链接 | **点击显示器开关** |
| 打开动画设置 | **点击「♫ 动画」按钮** → 弹出[动画设置](poster-management/animation.md) |
| 切换私有 / 公开 | **点击右下角的脸形图标** |

## 能做的事

| 功能 | 说明 |
|---|---|
| 图片注册 | 从 URL 获取 PNG / JPG 图片并内部存储 |
| 排序 | 通过列表中的交换来重新排序（带动画） |
| 自动 / 单张切换 | 轮播或单图显示 |
| FIT / COVER | 图片在框内的适配方式（裁剪或留边） |
| 显示器链接 | 通过[显示器连接卡](tools/monitor-link-card.md)在已链接的显示器上显示 |
| 动画设置 | 滑动方向 / 速度 / 效果（详见[动画](poster-management/animation.md)） |

## GUI 主要元素

| 元素 | 功能 |
|---|---|
| `Fit to monitor` 开关 | 开启 = FIT，关闭 = COVER |
| `Animate single only` 开关 | 开启 = 单张，关闭 = 轮播 |
| 已注册图片列表 | 上下滚动；逐行显示开关 + 交换操作 |
| 显示器离线开关 | 启用显示器链接 |
| `Animation` 按钮 | 在弹出窗口中设置动画（[动画](poster-management/animation.md)） |
| 物品栏 | 玩家物品栏 |
| 所有者脸形图标 | 私有 / 公开切换 |

## 图片注册

按下**「📂 选择文件」按钮**后，会打开你电脑的文件选择对话框。在此选择**一张 PNG / JPG / JPEG 图片**，该图片即被注册到此方块并加入列表。已注册的图片保存在服务器端，也会作为轮播显示在显示器上。

> [!NOTE]
> 每个文件大小限制为 5MB。过大的图片会报错。

## 显示器链接

```
[Poster Management Block] ─── [Monitor Link Card] ─── [Monitor Block × N]
```

- 用存储卡等链接海报管理方块。
- 已链接的显示器上会播放轮播。
- 一个海报方块 → 多个显示器也可以。
- 详情：[显示器连接卡](tools/monitor-link-card.md)

## 相关

- [动画设置](poster-management/animation.md)
- [显示器连接卡](tools/monitor-link-card.md)
- [存储卡](tools/memory-card.md)
- [管理用计算机显示器](management-computer/monitor.md)
