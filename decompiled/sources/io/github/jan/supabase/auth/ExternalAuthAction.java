package io.github.jan.supabase.auth;

import O3.C;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l.C1406b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction;", "", "ExternalBrowser", "CustomTabs", "Companion", "Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "Lio/github/jan/supabase/auth/ExternalAuthAction$ExternalBrowser;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExternalAuthAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "getDEFAULT", "()Lio/github/jan/supabase/auth/ExternalAuthAction;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ExternalAuthAction DEFAULT = ExternalBrowser.INSTANCE;

        private Companion() {
        }

        public final ExternalAuthAction getDEFAULT() {
            return DEFAULT;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\"\u0012\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0003J$\u0010\f\u001a\u00020\u00002\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "intentBuilder", "Lkotlin/Function1;", "Landroidx/browser/customtabs/CustomTabsIntent$Builder;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getIntentBuilder", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomTabs implements ExternalAuthAction {
        private final k intentBuilder;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomTabs() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C _init_$lambda$0(C1406b c1406b) {
            l.f("<this>", c1406b);
            return C.a;
        }

        public static /* synthetic */ CustomTabs copy$default(CustomTabs customTabs, k kVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                kVar = customTabs.intentBuilder;
            }
            return customTabs.copy(kVar);
        }

        /* renamed from: component1, reason: from getter */
        public final k getIntentBuilder() {
            return this.intentBuilder;
        }

        public final CustomTabs copy(k kVar) {
            l.f("intentBuilder", kVar);
            return new CustomTabs(kVar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomTabs) && l.a(this.intentBuilder, ((CustomTabs) other).intentBuilder);
        }

        public final k getIntentBuilder() {
            return this.intentBuilder;
        }

        public int hashCode() {
            return this.intentBuilder.hashCode();
        }

        public String toString() {
            return "CustomTabs(intentBuilder=" + this.intentBuilder + ')';
        }

        public CustomTabs(k kVar) {
            l.f("intentBuilder", kVar);
            this.intentBuilder = kVar;
        }

        public /* synthetic */ CustomTabs(k kVar, int i7, f fVar) {
            this((i7 & 1) != 0 ? new c(4) : kVar);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$ExternalBrowser;", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalBrowser implements ExternalAuthAction {
        public static final ExternalBrowser INSTANCE = new ExternalBrowser();

        private ExternalBrowser() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ExternalBrowser);
        }

        public int hashCode() {
            return -1146440786;
        }

        public String toString() {
            return "ExternalBrowser";
        }
    }
}
