package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: H5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3842b = AtomicIntegerFieldUpdater.newUpdater(C0262e.class, "notCompletedCount$volatile");
    public final G[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0262e(G[] gArr) {
        this.a = gArr;
        this.notCompletedCount$volatile = gArr.length;
    }
}
