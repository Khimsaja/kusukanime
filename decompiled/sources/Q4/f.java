package Q4;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8016l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f8017m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(e eVar, int i7) {
        super(0);
        this.f8016l = i7;
        this.f8017m = eVar;
    }

    @Override // Q4.c
    public final void K0(String[] strArr) {
        switch (this.f8016l) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.f8017m.f8015l.f8022d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.f8017m.f8015l.f8023e = strArr;
                return;
        }
    }
}
