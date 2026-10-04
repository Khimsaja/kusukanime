package Z3;

import java.io.File;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f10255b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f10256c;

    /* renamed from: d, reason: collision with root package name */
    public int f10257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f10258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File file) {
        super(file);
        this.f10258e = fVar;
    }

    @Override // Z3.g
    public final File a() {
        boolean z7 = this.f10255b;
        File file = this.a;
        f fVar = this.f10258e;
        if (!z7) {
            fVar.f10260n.getClass();
            this.f10255b = true;
            return file;
        }
        File[] fileArr = this.f10256c;
        if (fileArr != null && this.f10257d >= fileArr.length) {
            fVar.f10260n.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f10256c = fileArrListFiles;
            if (fileArrListFiles == null) {
                fVar.f10260n.getClass();
            }
            File[] fileArr2 = this.f10256c;
            if (fileArr2 == null || fileArr2.length == 0) {
                fVar.f10260n.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f10256c;
        l.c(fileArr3);
        int i7 = this.f10257d;
        this.f10257d = i7 + 1;
        return fileArr3[i7];
    }
}
