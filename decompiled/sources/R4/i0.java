package R4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum i0 implements InterfaceC0619p {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* renamed from: k, reason: collision with root package name */
    public final int f8519k;

    i0(int i7) {
        this.f8519k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8519k;
    }
}
