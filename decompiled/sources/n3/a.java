package n3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public static final a f13346k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a[] f13347l;

    static {
        a aVar = new a("INSTANCE", 0);
        f13346k = aVar;
        f13347l = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13347l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
