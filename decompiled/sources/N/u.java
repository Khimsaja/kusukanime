package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: k, reason: collision with root package name */
    public static final u f6828k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f6829l;

    /* renamed from: m, reason: collision with root package name */
    public static final u f6830m;

    /* renamed from: n, reason: collision with root package name */
    public static final u f6831n;

    /* renamed from: o, reason: collision with root package name */
    public static final u f6832o;

    /* renamed from: p, reason: collision with root package name */
    public static final u f6833p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ u[] f6834q;

    static {
        u uVar = new u("BodyLarge", 0);
        f6828k = uVar;
        u uVar2 = new u("BodyMedium", 1);
        f6829l = uVar2;
        u uVar3 = new u("BodySmall", 2);
        u uVar4 = new u("DisplayLarge", 3);
        u uVar5 = new u("DisplayMedium", 4);
        u uVar6 = new u("DisplaySmall", 5);
        u uVar7 = new u("HeadlineLarge", 6);
        u uVar8 = new u("HeadlineMedium", 7);
        u uVar9 = new u("HeadlineSmall", 8);
        f6830m = uVar9;
        u uVar10 = new u("LabelLarge", 9);
        f6831n = uVar10;
        u uVar11 = new u("LabelMedium", 10);
        f6832o = uVar11;
        u uVar12 = new u("LabelSmall", 11);
        f6833p = uVar12;
        f6834q = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, new u("TitleLarge", 12), new u("TitleMedium", 13), new u("TitleSmall", 14)};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f6834q.clone();
    }
}
