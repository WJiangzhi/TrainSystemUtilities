#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
TrainSystem Utilities — Wiki 本地化 v4 (opencc + 页面映射 + 短语翻译)
"""
import os
import re
import json

try:
    from opencc import OpenCC
    S2TW = OpenCC("s2twp").convert   # 台湾繁体（含词）
    S2HK = OpenCC("s2hk").convert    # 香港繁体
    print("✅ 使用 opencc 简繁转换")
except Exception as e:
    raise SystemExit(f"opencc import failed: {e}")

BASE_DIR = "/workspace/src/main/resources/assets/trainsystemutilities"
LANG_DIR = f"{BASE_DIR}/lang"
WIKI_DIR = f"{BASE_DIR}/wiki"
EN_DIR = f"{WIKI_DIR}/en_us"
CN_DIR = f"{WIKI_DIR}/zh_cn"
TW_DIR = f"{WIKI_DIR}/zh_tw"
HK_DIR = f"{WIKI_DIR}/zh_hk"

# ============================================================
# 1. LANG: zh_cn → zh_tw / zh_hk
# ============================================================
with open(f"{LANG_DIR}/zh_cn.json", "r", encoding="utf-8") as f:
    ZH_CN_LANG = json.load(f)

def conv_lang(fn, out_path):
    out = {}
    for k, v in ZH_CN_LANG.items():
        out[k] = fn(v) if isinstance(v, str) else v
    with open(out_path, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=False, indent=2)
        f.write("\n")
    print(f"✅ {out_path}: {len(out)} 条")

print("=" * 60)
print("步骤 1：生成 zh_tw.json / zh_hk.json ...")
print("=" * 60)
conv_lang(S2TW, f"{LANG_DIR}/zh_tw.json")
conv_lang(S2HK, f"{LANG_DIR}/zh_hk.json")

# ============================================================
# 2. 页面 ID → (zh_filename, zh_title)
# ============================================================
with open(f"{WIKI_DIR}/index.json", "r", encoding="utf-8") as f:
    PAGE_IDS = json.load(f)["pages"]

PAGE_MAP = {
    "index.md": ("index.md", "列车管理系统 Wiki"),
    "getting-started.md": ("getting-started.md", "快速开始"),
    "tutorial-videos.md": ("tutorial-videos.md", "视频教程"),
    "about.md": ("about.md", "关于 TSU"),
    "management-computer/overview.md": ("management-computer/overview.md", "管理用计算机 概述"),
    "management-computer/monitor.md": ("management-computer/monitor.md", "显示器"),
    "management-computer/route-map.md": ("management-computer/route-map.md", "线路图"),
    "management-computer/trains.md": ("management-computer/trains.md", "列车标签页"),
    "management-computer/schedule.md": ("management-computer/schedule.md", "时刻表标签页"),
    "management-computer/stations.md": ("management-computer/stations.md", "车站标签页"),
    "management-computer/tickets.md": ("management-computer/tickets.md", "车票标签页"),
    "management-computer/line-symbols.md": ("management-computer/line-symbols.md", "线路编号标签页"),
    "management-computer/layout-editor.md": ("management-computer/layout-editor.md", "布局编辑器"),
    "management-computer/color-settings.md": ("management-computer/color-settings.md", "颜色设置"),
    "management-computer/symbol-editor.md": ("management-computer/symbol-editor.md", "编号编辑器"),
    "railway-management.md": ("railway-management.md", "铁路管理方块"),
    "railway-management/settings.md": ("railway-management/settings.md", "显示器设置"),
    "railway-management/color.md": ("railway-management/color.md", "颜色设置"),
    "railway-management/announcement.md": ("railway-management/announcement.md", "广播设置"),
    "poster-management.md": ("poster-management.md", "海报管理方块"),
    "poster-management/animation.md": ("poster-management/animation.md", "动画设置"),
    "trains/coupling.md": ("trains/coupling.md", "列车连挂与解编"),
    "tools/station-range-tool.md": ("tools/station-range-tool.md", "车站范围指定工具"),
    "tools/transit-terminal.md": ("tools/transit-terminal.md", "换乘查询终端"),
    "tools/memory-card.md": ("tools/memory-card.md", "存储卡"),
    "tools/monitor-link-card.md": ("tools/monitor-link-card.md", "显示器连接卡"),
    "tools/train-detection-card.md": ("tools/train-detection-card.md", "列车检测卡"),
    "train-preset-tool/save.md": ("train-preset-tool/save.md", "预设保存"),
    "train-preset-tool/refill.md": ("train-preset-tool/refill.md", "材料补充"),
    "train-preset-tool/browse.md": ("train-preset-tool/browse.md", "预设浏览"),
    "preset-place/overview.md": ("preset-place/overview.md", "Preset Place 概述"),
    "preset-place/upload.md": ("preset-place/upload.md", "发布"),
    "preset-place/detail.md": ("preset-place/detail.md", "预设详情"),
    "preset-place/profile.md": ("preset-place/profile.md", "个人资料"),
    "preset-place/creator-center.md": ("preset-place/creator-center.md", "创作者中心"),
    "electrification/index.md": ("electrification/index.md", "电气化系统"),
    "electrification/wire-connector.md": ("electrification/wire-connector.md", "接触网与连接工具"),
    "electrification/custom-wire.md": ("electrification/custom-wire.md", "自定义接触网设计"),
    "electrification/pantograph.md": ("electrification/pantograph.md", "受电弓"),
    "electrification/fe-inverter.md": ("electrification/fe-inverter.md", "FE 逆变器"),
    "electrification/dummy-inverter.md": ("electrification/dummy-inverter.md", "虚拟逆变器"),
    "electrification/substation.md": ("electrification/substation.md", "箱式变电所"),
    "electrification/insulator.md": ("electrification/insulator.md", "绝缘子"),
    "electrification/power-checker.md": ("electrification/power-checker.md", "电力检测器"),
    "electrification/overhead-pole.md": ("electrification/overhead-pole.md", "接触网支柱"),
    "electrification/overhead-truss.md": ("electrification/overhead-truss.md", "接触网架"),
    "tools/overhead-pole-auto-tool.md": ("tools/overhead-pole-auto-tool.md", "支柱自动工具"),
    "structure/platform-fence.md": ("structure/platform-fence.md", "站台围栏"),
    "structure/platform-screen-door.md": ("structure/platform-screen-door.md", "站台屏蔽门"),
    "structure/ticket-vending-machine.md": ("structure/ticket-vending-machine.md", "自动售票机"),
    "structure/station-name-sign.md": ("structure/station-name-sign.md", "车站名称标识"),
    "structure/green-back.md": ("structure/green-back.md", "绿化墙"),
}

ANCHOR_MAP = {
    "hints-and-f1": "提示和-F1",
    "management-computer-overview": "管理用计算机概述",
    "railway-management-block": "铁路管理方块",
    "start-here": "从这里开始",
    "video-tutorials": "视频教程",
    "management-computer": "管理用计算机",
    "electrification-system": "电气化系统",
    "tools-items": "工具与物品",
    "preset-place-online-sharing": "Preset-Place（在线共享）",
    "other": "其他",
}

# ============================================================
# 3. EN → 简体中文 完整短语字典（长句优先）
# ============================================================
PHRASES = [
    # =====================================================
    # 整句（about.md top）
    # =====================================================
    ("TrainSystem Utilities (TSU) is an extension MOD that adds rail-related conveniences to Minecraft's **Create MOD (1.21.1)**.",
     "列车管理系统（TrainSystem Utilities，简称 TSU）是 Minecraft **Create MOD（1.21.1）** 的扩展 MOD，为游戏添加铁路相关的便捷功能。"),
    ("Built on top of Create's existing \"tracks / stations / schedules / signals\", TSU provides station display boards, network overview management, monitor integration, line symbols, an **electrification system**, and more, in a **realistic-looking but easy-for-anyone-to-use** form.",
     "在 Create 现有的「轨道 / 车站 / 时刻表 / 信号」基础上，TSU 以 **造型逼真、操作简单** 的形式提供车站显示板、路网总览管理、显示器整合、线路编号、**电气化系统** 等功能。"),

    # =====================================================
    # What can this MOD do? 表格 Feature/Summary 整句
    # =====================================================
    ("What is TrainSystem Utilities", "什么是 TrainSystem Utilities"),
    ("What can this MOD do?", "本 MOD 能做哪些事？"),
    ("Station-level display boards", "车站级显示板"),
    ("Place a \"Railway Management Block\" on a station platform to auto-display stopped / next trains",
     "在车站月台上放置「铁路管理方块」，自动显示已停靠 / 即将到站的列车"),
    ("Network overview management", "路网总览管理"),
    ("Use the \"Management Computer\" to manage all stations / trains / schedules in one place",
     "使用「管理用计算机」集中管理全部车站 / 列车 / 时刻表"),
    ("Station monitor integration", "车站显示器整合"),
    ("Place monitor blocks near a station for real-time display",
     "在车站附近放置显示器方块即可实时显示信息"),
    ("Line symbols", "线路编号"),
    ("Create custom line symbols like JA01 / JB02 and assign them to stations",
     "创建 JA01 / JB02 等自定义线路编号并分配给车站"),
    ("Coupling / decoupling", "连挂 / 解编"),
    ("Dynamically couple / decouple two trains via schedule conditions",
     "通过时刻表条件动态地让两列列车连挂 / 解编"),
    ("Poster display", "海报显示"),
    ("An advertisement board that displays PNG/JPG images as a slideshow",
     "以轮播方式显示 PNG/JPG 图片的广告板"),
    ("Electrification system", "电气化系统"),
    ("Pantograph + wire + substation + FE inverter to supply FE/Create energy to trains",
     "受电弓 + 接触网 + 变电所 + FE 逆变器，为列车提供 FE / Create 能量"),
    ("Train preset", "列车预设"),
    ("Save / restore / share an entire train as JSON",
     "将整列列车以 JSON 格式保存 / 恢复 / 分享"),
    ("Preset Place", "Preset Place"),
    ("Share train presets online (BelugaExperience platform)",
     "在线共享列车预设（基于 BelugaExperience 平台）"),
    ("Added items / blocks", "新增物品 / 方块"),
    ("Icons with a **blue marker in the bottom-right corner** are clickable and jump to that page.",
     "**右下角带有蓝色标记** 的图标可以点击跳转到对应页面。"),
    ("Station & display", "车站与显示"),
    ("Tools", "工具"),
    ("Data cards", "数据卡"),
    ("Electrification", "电气化"),
    ("See [Electrification System Overview](electrification/index.md) for details.",
     "详见 [电气化系统 概述](electrification/index.md)。"),
    ("→ See ", "→ 参见 "),
    (" for details.", " 了解详情。"),
    ("**It is NOT a MOD that \"drives trains itself\"**. Driving is handled by Create's schedules.",
     "**本 MOD 不会「自动驾驶列车」**。列车运行由 Create 的时刻表负责。"),
    ("TSU is a peripheral toolset that \"makes Create trains easier to view, manage, and electrify\".",
     "TSU 是「让 Create 列车的查看、管理与供电更加方便」的辅助工具集。"),
    ("What MODs is it designed to be used with?", "需要搭配哪些 MOD 使用？"),
    ("Recommended mods", "推荐配套 MOD"),
    ("It is designed to be used with", "本 MOD 设计搭配"),

    # =====================================================
    # 通用英文名词 / 形容词 / 动词 / 连接词 兜底
    # =====================================================
    ("extension MOD", "扩展 MOD"),
    ("adds rail-related conveniences", "添加铁路相关的便捷功能"),
    ("existing", "现有"),
    ("tracks / stations / schedules / signals", "轨道 / 车站 / 时刻表 / 信号"),
    ("provides", "提供"),
    ("station display boards", "车站显示板"),
    ("network overview management", "路网总览管理"),
    ("monitor integration", "显示器整合"),
    ("realistic-looking", "造型逼真"),
    ("easy-for-anyone-to-use", "人人易用"),
    ("form", "形式"),
    ("Feature", "功能"),
    ("Summary", "说明"),
    ("auto-display", "自动显示"),
    ("stopped / next trains", "已停靠 / 即将到站的列车"),
    ("one place", "一处 / 集中"),
    ("real-time display", "实时显示"),
    ("custom", "自定义"),
    ("like", "例如"),
    ("assign", "分配"),
    ("Dynamically", "动态地"),
    ("via", "通过"),
    ("conditions", "条件"),
    ("advertisement board", "广告板"),
    ("displays", "显示"),
    ("images", "图片"),
    ("as a slideshow", "以轮播形式"),
    ("supply", "供给"),
    ("to", "向"),
    ("trains", "列车"),
    ("entire", "整列"),
    ("as JSON", "以 JSON 格式"),
    ("online", "在线"),
    ("platform", "平台"),
    ("Icons", "图标"),
    ("with a", "带有"),
    ("blue marker", "蓝色标记"),
    ("bottom-right corner", "右下角"),
    ("clickable", "可点击"),
    ("jump to", "跳转到"),
    ("that page", "对应页面"),
    ("details", "详情"),
    ("designed to be used with", "设计搭配"),
    ("MOD", "MOD"),

    # =====================================================
    # 通用英语词（兜底，尽量按词性）
    # =====================================================
    ("What is", "什么是"),
    ("What can", "可以"),
    ("is an", "是一种"),
    ("that", ""),  # 尽量不单独翻，前面短语已涵盖
    ("Create MOD", "Create MOD"),
    ("on top of", "在…基础上"),
    ("and more", "等功能"),
    ("in a", "以…"),
    ("Station-level", "车站级"),
    ("Place a", "放置"),
    ("on a", "在…上"),
    ("platform", "月台"),
    ("to", "以"),
    ("Use the", "使用"),
    ("to manage", "来管理"),
    ("all", "全部"),
    ("in one place", "集中在一处"),
    ("near a", "靠近"),
    ("for", "用于"),
    ("Create custom", "创建自定义"),
    ("them to", "它们给"),
    ("two trains", "两列列车"),
    ("An", "一种"),
    ("that displays", "用于显示"),
    ("Save / restore / share", "保存 / 恢复 / 分享"),
    ("It is NOT", "并非"),
    ("drives trains itself", "自己驾驶列车"),
    ("Driving is handled by", "运行由…负责"),
    ("peripheral toolset", "外围工具组"),
    ("makes Create trains easier to view, manage, and electrify",
     "让 Create 列车更易于查看、管理和电气化"),

    # =====================================================
    # 通用：常见词形小字典
    # =====================================================
    ("Create", "Create"), ("Minecraft", "Minecraft"),
    ("tracks", "轨道"), ("track", "轨道"),
    ("stations", "车站"), ("station", "车站"),
    ("schedules", "时刻表"), ("schedule", "时刻表"),
    ("signals", "信号"), ("signal", "信号"),
    ("boards", "板"), ("board", "板"),
    ("network", "网络"), ("overview", "总览"),
    ("monitor", "显示器"), ("monitors", "显示器"),
    ("integration", "整合"), ("integrations", "整合"),
    ("line", "线路"), ("lines", "线路"),
    ("symbol", "编号"), ("symbols", "编号"),
    ("form", "形式"),
    ("feature", "功能"), ("features", "功能"),
    ("item", "物品"), ("items", "物品"),
    ("block", "方块"), ("blocks", "方块"),
    ("tool", "工具"), ("tools", "工具"),
    ("card", "卡"), ("cards", "卡"),
    ("display", "显示"), ("real-time", "实时"),
    ("assign", "分配"), ("assigned", "分配"),
    ("conditions", "条件"), ("condition", "条件"),
    ("advertisement", "广告"), ("slideshow", "轮播"),
    ("energy", "能量"), ("entire", "整个"),
    ("platform", "平台"), ("platform", "月台"),
    ("details", "详情"), ("detail", "详情"),
    ("recommended", "推荐的"),
    ("marker", "标记"), ("blue", "蓝色"),
    ("bottom-right", "右下角"), ("corner", "角落"),
    ("clickable", "可点击"), ("jump", "跳转"),
    ("page", "页面"),

    # =====================================================
    # Recommended mods 表（about.md）
    # =====================================================
    ("What MODs is it designed to be used with?", "需要搭配哪些 MOD 使用？"),
    ("Recommended mods", "推荐配套 MOD"),
    ("Role", "作用"),
    ("Required?", "是否必需？"),
    ("Required", "必需"),
    ("Recommended", "推荐"),
    ("Optional", "可选"),
    ("When using electrification", "使用电气化系统时需要"),
    ("The rail mechanism core", "铁路机制核心"),
    ("GUI / 显示器 / Wiki / BelugaExperience rendering framework",
     "GUI / 显示器 / Wiki / BelugaExperience 渲染框架"),
    ("Sound effects such as station departure melodies and announcements (author's other MOD)",
     "音效支持（例如车站发车旋律和广播），是作者的另一个 MOD"),
    ("departure melodies", "发车旋律"),
    ("and announcements", "和广播"),
    ("Sound effects", "音效"),
    ("such as", "例如"),
    ("author's other MOD", "作者的另一个 MOD"),
    ("FE power source to supply the electrification system",
     "用于为电气化系统提供 FE 能量源"),
    ("FE power source", "FE 能量源"),
    ("power source", "能量源"),
    ("以 供给", "供给"),
    ("Extra train mechanisms", "额外的列车机制"),
    ("Visual enhancement", "画质增强 / 视觉美化"),
    ("Combined with", "搭配"),
    ("SpatialAudioSystem", "SpatialAudioSystem"),
    ("departure melodies and in-train announcements play at the same station as your TSU station displays, greatly boosting the station's atmosphere.",
     "发车旋律与车内广播会和 TSU 车站显示在同一车站同步播放，大幅提升车站氛围。"),
    ("in-train announcements", "车内广播"),
    ("play at the same", "在同一…同步播放"),
    ("greatly boosting", "大幅提升"),
    ("atmosphere", "氛围"),
    ("station's atmosphere", "车站氛围"),
    ("Combined with **SpatialAudioSystem**, ", "搭配 **SpatialAudioSystem** 使用时，"),

    # 通用小动词 / 词
    ("The", ""), ("the", ""), ("and", "和"), ("or", "或"),
    ("with", "与"), ("as", "作为"), ("for", "用于"),
    ("etc.", "等"), ("etc", "等"),
    ("GUI / Monitor / Wiki / BelugaExperience rendering framework",
     "GUI / 显示器 / Wiki / BelugaExperience 渲染框架"),
    ("rendering framework", "渲染框架"),
    ("New Age, etc.", "New Age 等"),
    ("Shaders, etc.", "Shaders 等"),

    # === 整句（index.md top）===
    ("A comprehensive guide to TrainSystem Utilities, viewed alongside actual in-game GUI captures and 3D models.",
     "列车管理系统（TrainSystem Utilities）的综合指南，结合实际游戏内 GUI 截图与 3D 模型展示。"),
    ("Navigate to features / tools / electrification systems from this page.",
     "可在此页面导航至各功能、工具和电气化系统的说明。"),
    ("Video guides you can watch without leaving the game.",
     "无需离开游戏即可观看的视频教程。"),
    ("start with \"Using the In-Game Video System\"",
     "先从「使用游戏内视频系统」开始"),
    ("The central GUI that lets a single block oversee the entire rail network.",
     "只需一个方块即可监控与管理整个铁路网络的中枢 GUI。"),
    ("A subsystem that powers Create trains via overhead wires from FE / Create energy.",
     "通过接触网从 FE 或 Create 能量为 Create 列车供电的子系统。"),
    ("If you're stuck, the", "如果你陷入困境，"),
    ("section in", "章节中的"),
    ("is the fastest way to get oriented.", "是快速上手的最佳途径。"),

    # === 短语：页面标题 + 链接文本 ===
    ("TrainSystem Utilities Wiki", "列车管理系统 Wiki"),
    ("Getting Started", "快速开始"),
    ("What is TSU", "关于 TSU"),
    ("Management Computer Overview", "管理用计算机 概述"),
    ("Railway Management Block", "铁路管理方块"),
    ("Video Tutorials", "视频教程"),
    ("Monitor Display", "显示器"),
    ("Monitor Link", "显示器连接"),
    ("Monitor Link Card", "显示器连接卡"),
    ("Route Map", "线路图"),
    ("Trains Tab", "列车标签页"),
    ("Schedule Tab", "时刻表标签页"),
    ("Stations Tab", "车站标签页"),
    ("Tickets Tab", "车票标签页"),
    ("Line Symbols Tab", "线路编号标签页"),
    ("Symbol Editor", "编号编辑器"),
    ("Layout Editor", "布局编辑器"),
    ("Color Settings", "颜色设置"),
    ("Railway Management Block (Station Display)", "铁路管理方块（车站显示）"),
    ("Monitor Settings", "显示器设置"),
    ("Announcement Settings", "广播设置"),
    ("Poster Management Block", "海报管理方块"),
    ("Animation Settings", "动画设置"),
    ("Electrification System", "电气化系统"),
    ("Pantograph", "受电弓"),
    ("Wire & Wire Connector Tool", "接触网与连接工具"),
    ("Substation Cubicle", "箱式变电所"),
    ("FE Inverter", "FE 逆变器"),
    ("Dummy Inverter", "虚拟逆变器"),
    ("Custom Wire Designs", "自定义接触网设计"),
    ("Tools / Items", "工具与物品"),
    ("Station Range Tool", "车站范围指定工具"),
    ("Transit Terminal", "换乘查询终端"),
    ("Memory Card", "存储卡"),
    ("Train Detection Card", "列车检测卡"),
    ("Train Preset Tool", "列车预设工具"),
    ("Preset Save", "预设保存"),
    ("Preset Browse", "预设浏览"),
    ("Material Refill", "材料补充"),
    ("Preset Place (Online Sharing)", "Preset Place（在线共享）"),
    ("Preset Detail", "预设详情"),
    ("Profile", "个人资料"),
    ("Upload", "发布"),
    ("Creator Center", "创作者中心"),
    ("Train Coupling / Decoupling", "列车连挂与解编"),
    ("Other", "其他"),
    ("Start here", "从这里开始"),
    ("Hints and F1", "提示和 F1"),
    ("Insulator", "绝缘子"),
    ("Power Checker", "电力检测器"),
    ("Overhead Pole", "接触网支柱"),
    ("Overhead Truss", "接触网架"),
    ("Overhead Pole Auto Tool", "支柱自动工具"),
    ("Platform Fence", "站台围栏"),
    ("Platform Screen Door", "站台屏蔽门"),
    ("Ticket Vending Machine", "自动售票机"),
    ("Station Name Sign", "车站名称标识"),
    ("Green Back", "绿化墙"),
    ("Overview", "概述"),
    ("Electrification", "电气化"),

    # === 描述短语 ===
    ("basic operations and hint / F1 jump", "基础操作与提示 / F1 跳转功能"),
    ("overall mod scope and recommended environment", "MOD 整体范围与推荐运行环境"),
    ("current-collecting device mounted on cars", "安装在车顶上的集电装置"),
    ("5 built-in designs + presets", "5 种内置设计 + 自定义预设"),
    ("3×4×2 multiblock", "3×4×2 多方块结构"),
    ("buffer for Mekanism / AE2 etc.", "为 Mekanism / AE2 等 MOD 提供能量缓冲"),
    ("free thickness / spacing / rows", "自由调整粗细、间距和列数"),
    ("(SAS integration)", "（SAS 集成）"),

    # === 术语词级（兜底）===
    ("in-game", "游戏内"), ("In-Game", "游戏内"),
    ("GUI captures", "GUI 截图"), ("3D models", "3D 模型"),
    ("central GUI", "中枢 GUI"), ("overhead wires", "接触网"),
    ("current-collecting device", "集电装置"),
    ("multiblock", "多方块结构"), ("built-in designs", "内置设计"),
    ("online sharing", "在线共享"), ("recommended environment", "推荐运行环境"),
    ("mod scope", "MOD 范围"), ("basic operations", "基础操作"),
    ("hint / F1 jump", "提示 / F1 跳转"),
    ("entire rail network", "整个铁路网络"), ("single block", "单个方块"),
    ("SAS integration", "SAS 集成"), ("fastest way to get oriented", "快速上手的最佳途径"),
    ("Management Computer", "管理用计算机"),
    ("Station", "车站"), ("Stations", "车站"),
    ("Schedule", "时刻表"), ("Timetable", "时刻表"),
    ("Coupling", "连挂"), ("Decoupling", "解编"),
    ("Announcement", "广播"), ("Poster", "海报"), ("Animation", "动画"),
    ("Substation", "变电所"), ("Cubicle", "箱式"),
    ("Inverter", "逆变器"), ("Pantograph", "受电弓"),
    ("Wire Connector", "连接工具"),
    ("Preset Place", "Preset Place"), ("Preset", "预设"), ("Presets", "预设"),
    ("Detail", "详情"), ("Details", "详情"),
    ("Transit Terminal", "换乘查询终端"),
    ("Station Range Tool", "车站范围指定工具"),
    ("Memory Card", "存储卡"), ("Monitor Link Card", "显示器连接卡"),
    ("Train Detection Card", "列车检测卡"), ("Monitor Display", "显示器"),
    ("Layout Editor", "布局编辑器"), ("Color Settings", "颜色设置"),
    ("Monitor Settings", "显示器设置"), ("Symbol Editor", "编号编辑器"),
    ("Platform Fence", "站台围栏"), ("Platform Screen Door", "站台屏蔽门"),
    ("Ticket Vending Machine", "自动售票机"),
    ("Station Name Sign", "车站名称标识"), ("Green Back", "绿化墙"),
    ("Fence", "围栏"), ("Screen Door", "屏蔽门"),
    ("Vending Machine", "售票机"), ("Station Name", "车站名称"),
    ("Auto Tool", "自动工具"),
    ("Wiki", "Wiki"), ("Utilities", "Utilities"),
    ("Guide", "指南"), ("Guides", "指南"), ("Tutorial", "教程"), ("Tutorials", "教程"),
    ("Features", "功能"), ("Tools", "工具"), ("Items", "物品"),
    ("System", "系统"), ("Systems", "系统"), ("Subsystem", "子系统"),
    ("Network", "网络"), ("Integration", "集成"), ("Tab", "标签页"),
    ("Hints", "提示"), ("Section", "章节"),
    ("Upload", "发布"), ("Creator Center", "创作者中心"),
    ("Profile", "个人资料"),
]
# 按长度从大到小排序，优先匹配长句
PHRASES.sort(key=lambda x: -len(x[0]))
_PHRASE_KEYS = [re.escape(k) for k, _ in PHRASES]
_PHRASE_DICT = dict(PHRASES)
_PHRASE_RE = re.compile("|".join(_PHRASE_KEYS))

def en_to_cn(text):
    """英语→简体中文（按短语表最大匹配）"""
    return _PHRASE_RE.sub(lambda m: _PHRASE_DICT[m.group(0)], text)

# ============================================================
# 4. URL 翻译
# ============================================================
def translate_url(url):
    if url.startswith("http://") or url.startswith("https://") or url.startswith("#"):
        # 纯锚点
        if url.startswith("#") and url[1:] in ANCHOR_MAP:
            return "#" + ANCHOR_MAP[url[1:]]
        return url
    anchor = ""
    if "#" in url:
        url, anchor = url.split("#", 1)
        anchor = "#" + anchor
    if url in PAGE_MAP:
        url = PAGE_MAP[url][0]
    if anchor and anchor[1:] in ANCHOR_MAP:
        anchor = "#" + ANCHOR_MAP[anchor[1:]]
    return url + anchor

# ============================================================
# 5. EN Wiki → ZH_CN
# ============================================================
def protect_and_process(line, text_process_fn):
    """把 line 中的图片/链接/内联代码保护，翻译剩余文本，再恢复"""
    protect = []

    def save_img(m):
        protect.append(("img", m.group(1), m.group(2)))
        return f"__PR{len(protect)-1}__"
    tmp = re.sub(r'!\[([^\]]*)\]\(([^)]+)\)', save_img, line)

    def save_link(m):
        protect.append(("link", m.group(1), m.group(2)))
        return f"__PR{len(protect)-1}__"
    tmp = re.sub(r'(?<!\!)\[([^\]]*)\]\(([^)]+)\)', save_link, tmp)

    def save_code(m):
        protect.append(("code", m.group(1)))
        return f"__PR{len(protect)-1}__"
    tmp = re.sub(r'`([^`]+)`', save_code, tmp)

    out = text_process_fn(tmp)

    for i, item in enumerate(protect):
        tag = f"__PR{i}__"
        if item[0] == "img":
            _, alt, url = item
            out = out.replace(tag, f"![{text_process_fn(alt)}]({url})")
        elif item[0] == "link":
            _, text, url = item
            out = out.replace(tag, f"[{text_process_fn(text)}]({translate_url(url)})")
        elif item[0] == "code":
            _, code = item
            out = out.replace(tag, f"`{code}`")
    return out


def translate_wiki_to_cn(en_content):
    lines = en_content.split("\n")
    out = []
    in_code = False
    in_front = False
    fcount = 0
    for line in lines:
        s = line.strip()

        if s == "---" and not in_code:
            if fcount < 2:
                fcount += 1
                in_front = (fcount == 1)
            out.append(line)
            continue

        if in_front:
            if line.startswith("title:"):
                out.append("title: " + en_to_cn(line[len("title:"):].strip()))
            else:
                out.append(line)
            continue

        if s.startswith("```"):
            in_code = not in_code
            out.append(line)
            continue
        if in_code:
            out.append(line)
            continue

        if s == "[[TOC]]" or s == "{{/if}}" or re.match(r'\{\{if-mod', s):
            out.append(line)
            continue
        if s.startswith("```embed:") or s.startswith("embed:"):
            out.append(line)
            continue
        if re.match(r'>\s*\[!', s):
            m = re.match(r'(>\s*\[!)([^\]]+)(\])', line)
            if m:
                translated_tag = en_to_cn(m.group(2))
                line = line[:m.start(2)] + translated_tag + line[m.end(2):]
            out.append(line)
            continue

        out.append(protect_and_process(line, en_to_cn))
    return "\n".join(out)


# ============================================================
# 6. ZH_CN → ZH_TW / ZH_HK（Markdown 友好）
# ============================================================
def s2t_markdown(content, converter):
    lines = content.split("\n")
    out = []
    in_code = False
    in_front = False
    fcount = 0
    for line in lines:
        s = line.strip()

        if s == "---" and not in_code:
            if fcount < 2:
                fcount += 1
                in_front = (fcount == 1)
            out.append(line)
            continue

        if in_front:
            if line.startswith("title:"):
                out.append("title: " + converter(line[len("title:"):].strip()))
            else:
                out.append(line)
            continue

        if s.startswith("```"):
            in_code = not in_code
            out.append(line)
            continue
        if in_code:
            out.append(line)
            continue

        if s == "[[TOC]]" or s == "{{/if}}" or re.match(r'\{\{if-mod', s):
            out.append(line)
            continue
        if s.startswith("```embed:") or s.startswith("embed:"):
            out.append(line)
            continue
        if re.match(r'>\s*\[!', s):
            out.append(line)
            continue

        out.append(protect_and_process(line, converter))
    return "\n".join(out)


# ============================================================
# 7. 主流程
# ============================================================
for d in [CN_DIR, TW_DIR, HK_DIR]:
    os.makedirs(d, exist_ok=True)
    for sub in ["management-computer","railway-management","poster-management",
                "electrification","trains","tools","train-preset-tool",
                "preset-place","structure"]:
        os.makedirs(f"{d}/{sub}", exist_ok=True)

print("=" * 60)
print(f"步骤 2：翻译 {len(PAGE_IDS)} 个 Wiki 页面 ...")
print("=" * 60)

errors = []
for i, page_id in enumerate(PAGE_IDS, 1):
    en_path = f"{EN_DIR}/{page_id}"
    if not os.path.exists(en_path):
        errors.append(f"MISSING: {en_path}")
        continue
    with open(en_path, "r", encoding="utf-8") as f:
        en = f.read()
    try:
        cn = translate_wiki_to_cn(en)
        tw = s2t_markdown(cn, S2TW)
        hk = s2t_markdown(cn, S2HK)
    except Exception as e:
        errors.append(f"FAIL {page_id}: {e}")
        continue
    cn_fn = PAGE_MAP.get(page_id, (page_id, ""))[0]
    with open(f"{CN_DIR}/{cn_fn}", "w", encoding="utf-8") as f:
        f.write(cn)
    with open(f"{TW_DIR}/{cn_fn}", "w", encoding="utf-8") as f:
        f.write(tw)
    with open(f"{HK_DIR}/{cn_fn}", "w", encoding="utf-8") as f:
        f.write(hk)
    if i % 10 == 0 or i == len(PAGE_IDS):
        print(f"✅ {i}/{len(PAGE_IDS)} — {page_id}")

if errors:
    print("❌ 错误:")
    for e in errors:
        print("  -", e)
else:
    print("\n🎉 全部成功！")

for loc, d in [("zh_cn", CN_DIR), ("zh_tw", TW_DIR), ("zh_hk", HK_DIR)]:
    cnt = sum(1 for root, _, fs in os.walk(d) for fn in fs if fn.endswith(".md"))
    print(f"📁 {loc}: {cnt} 个 .md 文件")
