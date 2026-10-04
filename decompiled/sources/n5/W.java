package n5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: k, reason: collision with root package name */
    public static final W f13381k;

    /* renamed from: l, reason: collision with root package name */
    public static final W f13382l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ W[] f13383m;

    static {
        W w7 = new W("SUPERTYPE", 0);
        f13381k = w7;
        W w8 = new W("COMMON", 1);
        f13382l = w8;
        W[] wArr = {w7, w8};
        f13383m = wArr;
        AbstractC1420H.z(wArr);
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f13383m.clone();
    }
}
