package io.github.jan.supabase.postgrest;

import I1.e;
import P3.r;
import io.github.jan.supabase.PlatformTarget;
import io.github.jan.supabase.PlatformTargetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.InterfaceC1442u;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0019\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H¦\u0002¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "", "invoke", "", "property", "Lkotlin/reflect/KProperty1;", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PropertyConversionMethod {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod$Companion;", "", "<init>", "()V", "SERIAL_NAME", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getSERIAL_NAME", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "CAMEL_CASE_TO_SNAKE_CASE", "getCAMEL_CASE_TO_SNAKE_CASE", "NONE", "getNONE", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PropertyConversionMethod SERIAL_NAME = new e(22);
        private static final PropertyConversionMethod CAMEL_CASE_TO_SNAKE_CASE = new e(23);
        private static final PropertyConversionMethod NONE = new e(24);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String CAMEL_CASE_TO_SNAKE_CASE$lambda$0(InterfaceC1442u interfaceC1442u) {
            l.f("it", interfaceC1442u);
            return UtilsKt.camelToSnakeCase(interfaceC1442u.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String NONE$lambda$0(InterfaceC1442u interfaceC1442u) {
            l.f("it", interfaceC1442u);
            return interfaceC1442u.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String SERIAL_NAME$lambda$0(InterfaceC1442u interfaceC1442u) {
            l.f("it", interfaceC1442u);
            return GetColumnNameKt.getSerialName(interfaceC1442u);
        }

        public final PropertyConversionMethod getCAMEL_CASE_TO_SNAKE_CASE() {
            return CAMEL_CASE_TO_SNAKE_CASE;
        }

        public final PropertyConversionMethod getNONE() {
            return NONE;
        }

        public final PropertyConversionMethod getSERIAL_NAME() {
            if (r.I(PlatformTarget.JVM, PlatformTarget.ANDROID).contains(PlatformTargetKt.getCurrentPlatformTarget())) {
                return SERIAL_NAME;
            }
            throw new IllegalStateException("SerialName PropertyConversionMethod is only available on the JVM and ANDROID due to limited reflection on other targets. Use CAMEL_CASE_TO_SNAKE_CASE instead.");
        }
    }

    String invoke(InterfaceC1442u interfaceC1442u);
}
