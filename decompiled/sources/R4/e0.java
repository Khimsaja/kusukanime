package R4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum e0 implements InterfaceC0619p {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f8452k;

    e0(int i7) {
        this.f8452k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8452k;
    }
}
