package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: k, reason: collision with root package name */
    public static final y f6899k;

    /* renamed from: l, reason: collision with root package name */
    public static final y f6900l;

    /* renamed from: m, reason: collision with root package name */
    public static final y f6901m;

    /* renamed from: n, reason: collision with root package name */
    public static final y f6902n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ y[] f6903o;

    static {
        y yVar = new y("StartInput", 0);
        f6899k = yVar;
        y yVar2 = new y("StopInput", 1);
        f6900l = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        f6901m = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        f6902n = yVar4;
        f6903o = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f6903o.clone();
    }
}
