package R4;

import X4.InterfaceC0619p;

/* renamed from: R4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0579j implements InterfaceC0619p {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* renamed from: k, reason: collision with root package name */
    public final int f8526k;

    EnumC0579j(int i7) {
        this.f8526k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8526k;
    }
}
