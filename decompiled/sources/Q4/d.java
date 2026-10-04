package Q4;

import P4.l;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f8013m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i7) {
        super(0);
        this.f8012l = i7;
        this.f8013m = lVar;
    }

    @Override // Q4.c
    public final void K0(String[] strArr) {
        switch (this.f8012l) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((e) this.f8013m).f8015l.f8022d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((e) this.f8013m).f8015l.f8023e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((e) this.f8013m).f8015l.f8026h = strArr;
                return;
        }
    }
}
