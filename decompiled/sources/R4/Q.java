package R4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum Q implements InterfaceC0619p {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);


    /* renamed from: k, reason: collision with root package name */
    public final int f8265k;

    Q(int i7) {
        this.f8265k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8265k;
    }
}
