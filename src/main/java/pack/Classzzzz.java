package pack;

import java.io.File;
import java.util.regex.Pattern;

public class Classzzzz {
    @TestMetadata("anonymousObjectInDefault.kt")
    public void testAnonymousObjectInDefault() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/anonymousObjectInDefault.kt");
    }

    @TestMetadata("anonymousObjectOnCallSite.kt")
    public void testAnonymousObjectOnCallSite() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/anonymousObjectOnCallSite.kt");
    }

    @TestMetadata("anonymousObjectOnCallSiteSuperParams.kt")
    public void testAnonymousObjectOnCallSiteSuperParams() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/anonymousObjectOnCallSiteSuperParams.kt");
    }

    @TestMetadata("anonymousObjectOnDeclarationSite.kt")
    public void testAnonymousObjectOnDeclarationSite() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/anonymousObjectOnDeclarationSite.kt");
    }

    @TestMetadata("anonymousObjectOnDeclarationSiteSuperParams.kt")
    public void testAnonymousObjectOnDeclarationSiteSuperParams() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/anonymousObjectOnDeclarationSiteSuperParams.kt");
    }

    @TestMetadata("capturedLambdaInInline.kt")
    public void testCapturedLambdaInInline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/capturedLambdaInInline.kt");
    }

    @TestMetadata("capturedLambdaInInline2.kt")
    public void testCapturedLambdaInInline2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/capturedLambdaInInline2.kt");
    }

    @TestMetadata("capturedLambdaInInline3.kt")
    public void testCapturedLambdaInInline3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/capturedLambdaInInline3.kt");
    }

    @TestMetadata("capturedLambdaInInlineObject.kt")
    public void testCapturedLambdaInInlineObject() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/capturedLambdaInInlineObject.kt");
    }

    @TestMetadata("capturedLocalFun.kt")
    public void testCapturedLocalFun() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/capturedLocalFun.kt");
    }

    @TestMetadata("capturedLocalFunRef.kt")
    public void testCapturedLocalFunRef() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/capturedLocalFunRef.kt");
    }

    @TestMetadata("changingReturnType.kt")
    public void testChangingReturnType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/changingReturnType.kt");
    }

    @TestMetadata("constructorVisibility.kt")
    public void testConstructorVisibility() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/constructorVisibility.kt");
    }

    @TestMetadata("constructorVisibilityInConstLambda.kt")
    public void testConstructorVisibilityInConstLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/constructorVisibilityInConstLambda.kt");
    }

    @TestMetadata("constructorVisibilityInLambda.kt")
    public void testConstructorVisibilityInLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/constructorVisibilityInLambda.kt");
    }

    @TestMetadata("defineClass.kt")
    public void testDefineClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/defineClass.kt");
    }

    @TestMetadata("functionExpression.kt")
    public void testFunctionExpression() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/functionExpression.kt");
    }

    @TestMetadata("inlineCallInsideInlineLambda.kt")
    public void testInlineCallInsideInlineLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/inlineCallInsideInlineLambda.kt");
    }

    @TestMetadata("kt13133.kt")
    public void testKt13133() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt13133.kt");
    }

    @TestMetadata("kt13182.kt")
    public void testKt13182() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt13182.kt");
    }

    @TestMetadata("kt13374.kt")
    public void testKt13374() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt13374.kt");
    }

    @TestMetadata("kt14011.kt")
    public void testKt14011() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt14011.kt");
    }

    @TestMetadata("kt14011_2.kt")
    public void testKt14011_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt14011_2.kt");
    }

    @TestMetadata("kt14011_3.kt")
    public void testKt14011_3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt14011_3.kt");
    }

    @TestMetadata("kt15751.kt")
    public void testKt15751() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt15751.kt");
    }

    @TestMetadata("kt16193.kt")
    public void testKt16193() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt16193.kt");
    }

    @TestMetadata("kt17972.kt")
    public void testKt17972() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972.kt");
    }

    @TestMetadata("kt17972_2.kt")
    public void testKt17972_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_2.kt");
    }

    @TestMetadata("kt17972_3.kt")
    public void testKt17972_3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_3.kt");
    }

    @TestMetadata("kt17972_4.kt")
    public void testKt17972_4() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_4.kt");
    }

    @TestMetadata("kt17972_5.kt")
    public void testKt17972_5() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_5.kt");
    }

    @TestMetadata("kt17972_super.kt")
    public void testKt17972_super() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_super.kt");
    }

    @TestMetadata("kt17972_super2.kt")
    public void testKt17972_super2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_super2.kt");
    }

    @TestMetadata("kt17972_super3.kt")
    public void testKt17972_super3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt17972_super3.kt");
    }

    @TestMetadata("kt19389.kt")
    public void testKt19389() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt19389.kt");
    }

    @TestMetadata("kt19399.kt")
    public void testKt19399() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt19399.kt");
    }

    @TestMetadata("kt19434.kt")
    public void testKt19434() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt19434.kt");
    }

    @TestMetadata("kt19434_2.kt")
    public void testKt19434_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt19434_2.kt");
    }

    @TestMetadata("kt19723.kt")
    public void testKt19723() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt19723.kt");
    }

    @TestMetadata("kt34656.kt")
    public void testKt34656() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt34656.kt");
    }

    @TestMetadata("kt38197.kt")
    public void testKt38197() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt38197.kt");
    }

    @TestMetadata("kt42815.kt")
    public void testKt42815() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt42815.kt");
    }

    @TestMetadata("kt42815_delegated.kt")
    public void testKt42815_delegated() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt42815_delegated.kt");
    }

    @TestMetadata("kt6552.kt")
    public void testKt6552() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt6552.kt");
    }

    @TestMetadata("kt8133.kt")
    public void testKt8133() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt8133.kt");
    }

    @TestMetadata("kt9064.kt")
    public void testKt9064() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt9064.kt");
    }

    @TestMetadata("kt9064v2.kt")
    public void testKt9064v2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt9064v2.kt");
    }

    @TestMetadata("kt9591.kt")
    public void testKt9591() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt9591.kt");
    }

    @TestMetadata("kt9877.kt")
    public void testKt9877() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt9877.kt");
    }

    @TestMetadata("kt9877_2.kt")
    public void testKt9877_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/kt9877_2.kt");
    }

    @TestMetadata("objectInLambdaCapturesAnotherObject.kt")
    public void testObjectInLambdaCapturesAnotherObject() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/objectInLambdaCapturesAnotherObject.kt");
    }

    @TestMetadata("safeCall.kt")
    public void testSafeCall() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/safeCall.kt");
    }

    @TestMetadata("safeCall_2.kt")
    public void testSafeCall_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/safeCall_2.kt");
    }

    @TestMetadata("sam.kt")
    public void testSam() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/sam.kt");
    }

    @TestMetadata("sharedFromCrossinline.kt")
    public void testSharedFromCrossinline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/sharedFromCrossinline.kt");
    }

    @TestMetadata("superConstructorWithObjectParameter.kt")
    public void testSuperConstructorWithObjectParameter() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/superConstructorWithObjectParameter.kt");
    }

    @TestMetadata("typeInfo.kt")
    public void testTypeInfo() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/typeInfo.kt");
    }

    @TestMetadata("withInlineMethod.kt")
    public void testWithInlineMethod() throws Exception {
        runTest("compiler/testData/codegen/boxInline/anonymousObject/withInlineMethod.kt");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/anonymousObject/enumWhen")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class EnumWhen extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInEnumWhen() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/anonymousObject/enumWhen"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("callSite.kt")
        public void testCallSite() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/enumWhen/callSite.kt");
        }

        @TestMetadata("declSite.kt")
        public void testDeclSite() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/enumWhen/declSite.kt");
        }

        @TestMetadata("declSiteSeveralMappings.kt")
        public void testDeclSiteSeveralMappings() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/enumWhen/declSiteSeveralMappings.kt");
        }

        @TestMetadata("declSiteSeveralMappingsDifOrder.kt")
        public void testDeclSiteSeveralMappingsDifOrder() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/enumWhen/declSiteSeveralMappingsDifOrder.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ProperRecapturing extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInProperRecapturing() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("inlineChain.kt")
        public void testInlineChain() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing/inlineChain.kt");
        }

        @TestMetadata("lambdaChain.kt")
        public void testLambdaChain() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing/lambdaChain.kt");
        }

        @TestMetadata("lambdaChainSimple.kt")
        public void testLambdaChainSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing/lambdaChainSimple.kt");
        }

        @TestMetadata("lambdaChain_2.kt")
        public void testLambdaChain_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing/lambdaChain_2.kt");
        }

        @TestMetadata("lambdaChain_3.kt")
        public void testLambdaChain_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing/lambdaChain_3.kt");
        }

        @TestMetadata("noInlineLambda.kt")
        public void testNoInlineLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturing/noInlineLambda.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ProperRecapturingInClass extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInProperRecapturingInClass() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("inlineChain.kt")
        public void testInlineChain() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/inlineChain.kt");
        }

        @TestMetadata("inlinelambdaChain.kt")
        public void testInlinelambdaChain() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/inlinelambdaChain.kt");
        }

        @TestMetadata("lambdaChain.kt")
        public void testLambdaChain() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/lambdaChain.kt");
        }

        @TestMetadata("lambdaChainSimple.kt")
        public void testLambdaChainSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/lambdaChainSimple.kt");
        }

        @TestMetadata("lambdaChainSimple_2.kt")
        public void testLambdaChainSimple_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/lambdaChainSimple_2.kt");
        }

        @TestMetadata("lambdaChain_2.kt")
        public void testLambdaChain_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/lambdaChain_2.kt");
        }

        @TestMetadata("lambdaChain_3.kt")
        public void testLambdaChain_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/lambdaChain_3.kt");
        }

        @TestMetadata("noCapturedThisOnCallSite.kt")
        public void testNoCapturedThisOnCallSite() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/noCapturedThisOnCallSite.kt");
        }

        @TestMetadata("noInlineLambda.kt")
        public void testNoInlineLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/noInlineLambda.kt");
        }

        @TestMetadata("twoInlineLambda.kt")
        public void testTwoInlineLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/twoInlineLambda.kt");
        }

        @TestMetadata("twoInlineLambdaComplex.kt")
        public void testTwoInlineLambdaComplex() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/twoInlineLambdaComplex.kt");
        }

        @TestMetadata("twoInlineLambdaComplex_2.kt")
        public void testTwoInlineLambdaComplex_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/properRecapturingInClass/twoInlineLambdaComplex_2.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/anonymousObject/sam")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Sam extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInSam() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/anonymousObject/sam"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("anonymousObjectToSam.kt")
        public void testAnonymousObjectToSam() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/anonymousObjectToSam.kt");
        }

        @TestMetadata("kt17091.kt")
        public void testKt17091() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/kt17091.kt");
        }

        @TestMetadata("kt21671.kt")
        public void testKt21671() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/kt21671.kt");
        }

        @TestMetadata("kt21671_2.kt")
        public void testKt21671_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/kt21671_2.kt");
        }

        @TestMetadata("kt21671_3.kt")
        public void testKt21671_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/kt21671_3.kt");
        }

        @TestMetadata("kt22304.kt")
        public void testKt22304() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/kt22304.kt");
        }

        @TestMetadata("samOnCallSite.kt")
        public void testSamOnCallSite() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/sam/samOnCallSite.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TwoCapturedReceivers extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInTwoCapturedReceivers() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("kt8668.kt")
        public void testKt8668() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers/kt8668.kt");
        }

        @TestMetadata("kt8668_2.kt")
        public void testKt8668_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers/kt8668_2.kt");
        }

        @TestMetadata("kt8668_3.kt")
        public void testKt8668_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers/kt8668_3.kt");
        }

        @TestMetadata("twoDifferentDispatchReceivers.kt")
        public void testTwoDifferentDispatchReceivers() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers/twoDifferentDispatchReceivers.kt");
        }

        @TestMetadata("twoExtensionReceivers.kt")
        public void testTwoExtensionReceivers() throws Exception {
            runTest("compiler/testData/codegen/boxInline/anonymousObject/twoCapturedReceivers/twoExtensionReceivers.kt");
        }
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/argumentOrder")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class ArgumentOrder extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInArgumentOrder() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/argumentOrder"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("boundFunctionReference.kt")
    public void testBoundFunctionReference() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/boundFunctionReference.kt");
    }

    @TestMetadata("boundFunctionReference2.kt")
    public void testBoundFunctionReference2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/boundFunctionReference2.kt");
    }

    @TestMetadata("captured.kt")
    public void testCaptured() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/captured.kt");
    }

    @TestMetadata("capturedInExtension.kt")
    public void testCapturedInExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/capturedInExtension.kt");
    }

    @TestMetadata("defaultParametersAndLastVararg.kt")
    public void testDefaultParametersAndLastVararg() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/defaultParametersAndLastVararg.kt");
    }

    @TestMetadata("defaultParametersAndLastVarargWithCorrectOrder.kt")
    public void testDefaultParametersAndLastVarargWithCorrectOrder() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/defaultParametersAndLastVarargWithCorrectOrder.kt");
    }

    @TestMetadata("extension.kt")
    public void testExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/extension.kt");
    }

    @TestMetadata("extensionInClass.kt")
    public void testExtensionInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/extensionInClass.kt");
    }

    @TestMetadata("lambdaMigration.kt")
    public void testLambdaMigration() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/lambdaMigration.kt");
    }

    @TestMetadata("lambdaMigrationInClass.kt")
    public void testLambdaMigrationInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/lambdaMigrationInClass.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/simple.kt");
    }

    @TestMetadata("simpleInClass.kt")
    public void testSimpleInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/simpleInClass.kt");
    }

    @TestMetadata("varargAndDefaultParameters.kt")
    public void testVarargAndDefaultParameters() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/varargAndDefaultParameters.kt");
    }

    @TestMetadata("varargAndDefaultParametersWithCorrectOrder.kt")
    public void testVarargAndDefaultParametersWithCorrectOrder() throws Exception {
        runTest("compiler/testData/codegen/boxInline/argumentOrder/varargAndDefaultParametersWithCorrectOrder.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/arrayConvention")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class ArrayConvention extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInArrayConvention() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/arrayConvention"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("simpleAccess.kt")
    public void testSimpleAccess() throws Exception {
        runTest("compiler/testData/codegen/boxInline/arrayConvention/simpleAccess.kt");
    }

    @TestMetadata("simpleAccessInClass.kt")
    public void testSimpleAccessInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/arrayConvention/simpleAccessInClass.kt");
    }

    @TestMetadata("simpleAccessWithDefault.kt")
    public void testSimpleAccessWithDefault() throws Exception {
        runTest("compiler/testData/codegen/boxInline/arrayConvention/simpleAccessWithDefault.kt");
    }

    @TestMetadata("simpleAccessWithDefaultInClass.kt")
    public void testSimpleAccessWithDefaultInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/arrayConvention/simpleAccessWithDefaultInClass.kt");
    }

    @TestMetadata("simpleAccessWithLambda.kt")
    public void testSimpleAccessWithLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/arrayConvention/simpleAccessWithLambda.kt");
    }

    @TestMetadata("simpleAccessWithLambdaInClass.kt")
    public void testSimpleAccessWithLambdaInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/arrayConvention/simpleAccessWithLambdaInClass.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/assert")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class Assert extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInAssert() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/assert"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("jvmAssertInlineFunctionAssertionsDisabled.kt")
    public void testJvmAssertInlineFunctionAssertionsDisabled() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmAssertInlineFunctionAssertionsDisabled.kt");
    }

    @TestMetadata("jvmAssertInlineFunctionAssertionsEnabled.kt")
    public void testJvmAssertInlineFunctionAssertionsEnabled() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmAssertInlineFunctionAssertionsEnabled.kt");
    }

    @TestMetadata("jvmAssertInlineLambda.kt")
    public void testJvmAssertInlineLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmAssertInlineLambda.kt");
    }

    @TestMetadata("jvmClassInitializer.kt")
    public void testJvmClassInitializer() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmClassInitializer.kt");
    }

    @TestMetadata("jvmCompanion.kt")
    public void testJvmCompanion() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmCompanion.kt");
    }

    @TestMetadata("jvmCrossinlineLambda.kt")
    public void testJvmCrossinlineLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmCrossinlineLambda.kt");
    }

    @TestMetadata("jvmCrossinlineLambda2.kt")
    public void testJvmCrossinlineLambda2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmCrossinlineLambda2.kt");
    }

    @TestMetadata("jvmCrossinlineLambdaDeclarationSite.kt")
    public void testJvmCrossinlineLambdaDeclarationSite() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmCrossinlineLambdaDeclarationSite.kt");
    }

    @TestMetadata("jvmCrossinlineLambdaDeclarationSiteOnly.kt")
    public void testJvmCrossinlineLambdaDeclarationSiteOnly() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmCrossinlineLambdaDeclarationSiteOnly.kt");
    }

    @TestMetadata("jvmCrossinlineSAMDeclarationSite.kt")
    public void testJvmCrossinlineSAMDeclarationSite() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmCrossinlineSAMDeclarationSite.kt");
    }

    @TestMetadata("jvmDoubleInline.kt")
    public void testJvmDoubleInline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmDoubleInline.kt");
    }

    @TestMetadata("jvmInlineUsedAsNoinline.kt")
    public void testJvmInlineUsedAsNoinline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/assert/jvmInlineUsedAsNoinline.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/builders")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class Builders extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInBuilders() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/builders"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("builders.kt")
    public void testBuilders() throws Exception {
        runTest("compiler/testData/codegen/boxInline/builders/builders.kt");
    }

    @TestMetadata("buildersAndLambdaCapturing.kt")
    public void testBuildersAndLambdaCapturing() throws Exception {
        runTest("compiler/testData/codegen/boxInline/builders/buildersAndLambdaCapturing.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/bytecodePreprocessing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class BytecodePreprocessing extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInBytecodePreprocessing() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/bytecodePreprocessing"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("apiVersionAtLeast1.kt")
    public void testApiVersionAtLeast1() throws Exception {
        runTest("compiler/testData/codegen/boxInline/bytecodePreprocessing/apiVersionAtLeast1.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/callableReference")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class CallableReference extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    @TestMetadata("adapted.kt")
    public void testAdapted() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/adapted.kt");
    }

    public void testAllFilesPresentInCallableReference() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/callableReference"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("classLevel.kt")
    public void testClassLevel() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/classLevel.kt");
    }

    @TestMetadata("classLevel2.kt")
    public void testClassLevel2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/classLevel2.kt");
    }

    @TestMetadata("constructor.kt")
    public void testConstructor() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/constructor.kt");
    }

    @TestMetadata("innerGenericConstuctor.kt")
    public void testInnerGenericConstuctor() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/innerGenericConstuctor.kt");
    }

    @TestMetadata("intrinsic.kt")
    public void testIntrinsic() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/intrinsic.kt");
    }

    @TestMetadata("jvmFieldProperty.kt")
    public void testJvmFieldProperty() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/jvmFieldProperty.kt");
    }

    @TestMetadata("kt15449.kt")
    public void testKt15449() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/kt15449.kt");
    }

    @TestMetadata("kt15751_2.kt")
    public void testKt15751_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/kt15751_2.kt");
    }

    @TestMetadata("kt16411.kt")
    public void testKt16411() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/kt16411.kt");
    }

    @TestMetadata("kt35101.kt")
    public void testKt35101() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/kt35101.kt");
    }

    @TestMetadata("propertyIntrinsic.kt")
    public void testPropertyIntrinsic() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/propertyIntrinsic.kt");
    }

    @TestMetadata("propertyReference.kt")
    public void testPropertyReference() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/propertyReference.kt");
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/topLevel.kt");
    }

    @TestMetadata("topLevelExtension.kt")
    public void testTopLevelExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/topLevelExtension.kt");
    }

    @TestMetadata("topLevelProperty.kt")
    public void testTopLevelProperty() throws Exception {
        runTest("compiler/testData/codegen/boxInline/callableReference/topLevelProperty.kt");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/callableReference/bound")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Bound extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInBound() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/callableReference/bound"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("classProperty.kt")
        public void testClassProperty() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/classProperty.kt");
        }

        @TestMetadata("emptyLhsFunction.kt")
        public void testEmptyLhsFunction() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/emptyLhsFunction.kt");
        }

        @TestMetadata("emptyLhsOnInlineProperty.kt")
        public void testEmptyLhsOnInlineProperty() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/emptyLhsOnInlineProperty.kt");
        }

        @TestMetadata("emptyLhsProperty.kt")
        public void testEmptyLhsProperty() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/emptyLhsProperty.kt");
        }

        @TestMetadata("expression.kt")
        public void testExpression() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/expression.kt");
        }

        @TestMetadata("extensionReceiver.kt")
        public void testExtensionReceiver() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/extensionReceiver.kt");
        }

        @TestMetadata("filter.kt")
        public void testFilter() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/filter.kt");
        }

        @TestMetadata("inlineValueParameterInsteadOfReceiver.kt")
        public void testInlineValueParameterInsteadOfReceiver() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/inlineValueParameterInsteadOfReceiver.kt");
        }

        @TestMetadata("innerGenericConstuctor.kt")
        public void testInnerGenericConstuctor() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/innerGenericConstuctor.kt");
        }

        @TestMetadata("intrinsic.kt")
        public void testIntrinsic() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/intrinsic.kt");
        }

        @TestMetadata("jvmFieldProperty.kt")
        public void testJvmFieldProperty() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/jvmFieldProperty.kt");
        }

        @TestMetadata("kt18728.kt")
        public void testKt18728() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/kt18728.kt");
        }

        @TestMetadata("kt18728_2.kt")
        public void testKt18728_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/kt18728_2.kt");
        }

        @TestMetadata("kt18728_3.kt")
        public void testKt18728_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/kt18728_3.kt");
        }

        @TestMetadata("kt18728_4.kt")
        public void testKt18728_4() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/kt18728_4.kt");
        }

        @TestMetadata("map.kt")
        public void testMap() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/map.kt");
        }

        @TestMetadata("mixed.kt")
        public void testMixed() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/mixed.kt");
        }

        @TestMetadata("objectProperty.kt")
        public void testObjectProperty() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/objectProperty.kt");
        }

        @TestMetadata("propertyImportedFromObject.kt")
        public void testPropertyImportedFromObject() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/propertyImportedFromObject.kt");
        }

        @TestMetadata("sideEffect.kt")
        public void testSideEffect() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/sideEffect.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/simple.kt");
        }

        @TestMetadata("simpleVal.kt")
        public void testSimpleVal() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/simpleVal.kt");
        }

        @TestMetadata("simpleVal2.kt")
        public void testSimpleVal2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/simpleVal2.kt");
        }

        @TestMetadata("topLevelExtensionProperty.kt")
        public void testTopLevelExtensionProperty() throws Exception {
            runTest("compiler/testData/codegen/boxInline/callableReference/bound/topLevelExtensionProperty.kt");
        }
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/capture")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class Capture extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInCapture() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/capture"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("captureInlinable.kt")
    public void testCaptureInlinable() throws Exception {
        runTest("compiler/testData/codegen/boxInline/capture/captureInlinable.kt");
    }

    @TestMetadata("captureInlinableAndOther.kt")
    public void testCaptureInlinableAndOther() throws Exception {
        runTest("compiler/testData/codegen/boxInline/capture/captureInlinableAndOther.kt");
    }

    @TestMetadata("captureThisAndReceiver.kt")
    public void testCaptureThisAndReceiver() throws Exception {
        runTest("compiler/testData/codegen/boxInline/capture/captureThisAndReceiver.kt");
    }

    @TestMetadata("generics.kt")
    public void testGenerics() throws Exception {
        runTest("compiler/testData/codegen/boxInline/capture/generics.kt");
    }

    @TestMetadata("simpleCapturingInClass.kt")
    public void testSimpleCapturingInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/capture/simpleCapturingInClass.kt");
    }

    @TestMetadata("simpleCapturingInPackage.kt")
    public void testSimpleCapturingInPackage() throws Exception {
        runTest("compiler/testData/codegen/boxInline/capture/simpleCapturingInPackage.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/complex")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class Complex extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInComplex() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/complex"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("closureChain.kt")
    public void testClosureChain() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/closureChain.kt");
    }

    @TestMetadata("forEachLine.kt")
    public void testForEachLine() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/forEachLine.kt");
    }

    @TestMetadata("lambdaInLambda.kt")
    public void testLambdaInLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/lambdaInLambda.kt");
    }

    @TestMetadata("swapAndWith.kt")
    public void testSwapAndWith() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/swapAndWith.kt");
    }

    @TestMetadata("swapAndWith2.kt")
    public void testSwapAndWith2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/swapAndWith2.kt");
    }

    @TestMetadata("use.kt")
    public void testUse() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/use.kt");
    }

    @TestMetadata("with.kt")
    public void testWith() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complex/with.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/complexStack")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class ComplexStack extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInComplexStack() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/complexStack"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("asCheck.kt")
    public void testAsCheck() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/asCheck.kt");
    }

    @TestMetadata("asCheck2.kt")
    public void testAsCheck2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/asCheck2.kt");
    }

    @TestMetadata("breakContinueInInlineLambdaArgument.kt")
    public void testBreakContinueInInlineLambdaArgument() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/breakContinueInInlineLambdaArgument.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/simple.kt");
    }

    @TestMetadata("simple2.kt")
    public void testSimple2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/simple2.kt");
    }

    @TestMetadata("simple3.kt")
    public void testSimple3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/simple3.kt");
    }

    @TestMetadata("simple4.kt")
    public void testSimple4() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/simple4.kt");
    }

    @TestMetadata("simpleExtension.kt")
    public void testSimpleExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/simpleExtension.kt");
    }

    @TestMetadata("spillConstructorArgumentsAndInlineLambdaParameter.kt")
    public void testSpillConstructorArgumentsAndInlineLambdaParameter() throws Exception {
        runTest("compiler/testData/codegen/boxInline/complexStack/spillConstructorArgumentsAndInlineLambdaParameter.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/contracts")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class Contracts extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInContracts() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/contracts"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("cfgDependendValInitialization.kt")
    public void testCfgDependendValInitialization() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/cfgDependendValInitialization.kt");
    }

    @TestMetadata("complexInitializer.kt")
    public void testComplexInitializer() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/complexInitializer.kt");
    }

    @TestMetadata("complexInitializerWithStackTransformation.kt")
    public void testComplexInitializerWithStackTransformation() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/complexInitializerWithStackTransformation.kt");
    }

    @TestMetadata("crossinlineCallableReference.kt")
    public void testCrossinlineCallableReference() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/crossinlineCallableReference.kt");
    }

    @TestMetadata("definiteLongValInitialization.kt")
    public void testDefiniteLongValInitialization() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/definiteLongValInitialization.kt");
    }

    @TestMetadata("definiteNestedValInitialization.kt")
    public void testDefiniteNestedValInitialization() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/definiteNestedValInitialization.kt");
    }

    @TestMetadata("definiteValInitInInitializer.kt")
    public void testDefiniteValInitInInitializer() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/definiteValInitInInitializer.kt");
    }

    @TestMetadata("definiteValInitialization.kt")
    public void testDefiniteValInitialization() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/definiteValInitialization.kt");
    }

    @TestMetadata("exactlyOnceCrossinline.kt")
    public void testExactlyOnceCrossinline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/exactlyOnceCrossinline.kt");
    }

    @TestMetadata("exactlyOnceCrossinline2.kt")
    public void testExactlyOnceCrossinline2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/exactlyOnceCrossinline2.kt");
    }

    @TestMetadata("exactlyOnceNoinline.kt")
    public void testExactlyOnceNoinline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/exactlyOnceNoinline.kt");
    }

    @TestMetadata("nonLocalReturn.kt")
    public void testNonLocalReturn() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/nonLocalReturn.kt");
    }

    @TestMetadata("nonLocalReturnWithCycle.kt")
    public void testNonLocalReturnWithCycle() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/nonLocalReturnWithCycle.kt");
    }

    @TestMetadata("propertyInitialization.kt")
    public void testPropertyInitialization() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/propertyInitialization.kt");
    }

    @TestMetadata("valInitializationAndUsageInNestedLambda.kt")
    public void testValInitializationAndUsageInNestedLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/contracts/valInitializationAndUsageInNestedLambda.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/defaultValues")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class DefaultValues extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    @TestMetadata("33Parameters.kt")
    public void test33Parameters() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/33Parameters.kt");
    }

    @TestMetadata("33ParametersInConstructor.kt")
    public void test33ParametersInConstructor() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/33ParametersInConstructor.kt");
    }

    public void testAllFilesPresentInDefaultValues() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("defaultInExtension.kt")
    public void testDefaultInExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultInExtension.kt");
    }

    @TestMetadata("defaultMethod.kt")
    public void testDefaultMethod() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultMethod.kt");
    }

    @TestMetadata("defaultMethodInClass.kt")
    public void testDefaultMethodInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultMethodInClass.kt");
    }

    @TestMetadata("defaultParamRemapping.kt")
    public void testDefaultParamRemapping() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultParamRemapping.kt");
    }

    @TestMetadata("inlineInDefaultParameter.kt")
    public void testInlineInDefaultParameter() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/inlineInDefaultParameter.kt");
    }

    @TestMetadata("inlineLambdaInNoInlineDefault.kt")
    public void testInlineLambdaInNoInlineDefault() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/inlineLambdaInNoInlineDefault.kt");
    }

    @TestMetadata("kt11479.kt")
    public void testKt11479() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt11479.kt");
    }

    @TestMetadata("kt11479InlinedDefaultParameter.kt")
    public void testKt11479InlinedDefaultParameter() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt11479InlinedDefaultParameter.kt");
    }

    @TestMetadata("kt14564.kt")
    public void testKt14564() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt14564.kt");
    }

    @TestMetadata("kt14564_2.kt")
    public void testKt14564_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt14564_2.kt");
    }

    @TestMetadata("kt16496.kt")
    public void testKt16496() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt16496.kt");
    }

    @TestMetadata("kt18689.kt")
    public void testKt18689() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689.kt");
    }

    @TestMetadata("kt18689_2.kt")
    public void testKt18689_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689_2.kt");
    }

    @TestMetadata("kt18689_3.kt")
    public void testKt18689_3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689_3.kt");
    }

    @TestMetadata("kt18689_4.kt")
    public void testKt18689_4() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689_4.kt");
    }

    @TestMetadata("kt5685.kt")
    public void testKt5685() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt5685.kt");
    }

    @TestMetadata("simpleDefaultMethod.kt")
    public void testSimpleDefaultMethod() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/simpleDefaultMethod.kt");
    }

    @TestMetadata("varArgNoInline.kt")
    public void testVarArgNoInline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/varArgNoInline.kt");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class LambdaInlining extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInLambdaInlining() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("checkLambdaClassIsPresent.kt")
        public void testCheckLambdaClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkLambdaClassIsPresent.kt");
        }

        @TestMetadata("checkLambdaClassesArePresent.kt")
        public void testCheckLambdaClassesArePresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkLambdaClassesArePresent.kt");
        }

        @TestMetadata("checkObjectClassIsPresent.kt")
        public void testCheckObjectClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkObjectClassIsPresent.kt");
        }

        @TestMetadata("checkStaticLambdaClassIsPresent.kt")
        public void testCheckStaticLambdaClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkStaticLambdaClassIsPresent.kt");
        }

        @TestMetadata("checkStaticLambdaClassesArePresent.kt")
        public void testCheckStaticLambdaClassesArePresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkStaticLambdaClassesArePresent.kt");
        }

        @TestMetadata("checkStaticObjectClassIsPresent.kt")
        public void testCheckStaticObjectClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkStaticObjectClassIsPresent.kt");
        }

        @TestMetadata("defaultCallInDefaultLambda.kt")
        public void testDefaultCallInDefaultLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/defaultCallInDefaultLambda.kt");
        }

        @TestMetadata("defaultLambdaInNoInline.kt")
        public void testDefaultLambdaInNoInline() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/defaultLambdaInNoInline.kt");
        }

        @TestMetadata("differentInvokeSignature.kt")
        public void testDifferentInvokeSignature() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/differentInvokeSignature.kt");
        }

        @TestMetadata("genericLambda.kt")
        public void testGenericLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/genericLambda.kt");
        }

        @TestMetadata("instanceCapturedInClass.kt")
        public void testInstanceCapturedInClass() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/instanceCapturedInClass.kt");
        }

        @TestMetadata("instanceCapturedInInterface.kt")
        public void testInstanceCapturedInInterface() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/instanceCapturedInInterface.kt");
        }

        @TestMetadata("jvmStaticDefault.kt")
        public void testJvmStaticDefault() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/jvmStaticDefault.kt");
        }

        @TestMetadata("kt21827.kt")
        public void testKt21827() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt21827.kt");
        }

        @TestMetadata("kt21946.kt")
        public void testKt21946() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt21946.kt");
        }

        @TestMetadata("kt24477.kt")
        public void testKt24477() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt24477.kt");
        }

        @TestMetadata("kt25106.kt")
        public void testKt25106() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt25106.kt");
        }

        @TestMetadata("kt26636.kt")
        public void testKt26636() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt26636.kt");
        }

        @TestMetadata("noInline.kt")
        public void testNoInline() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/noInline.kt");
        }

        @TestMetadata("nonDefaultInlineInNoInline.kt")
        public void testNonDefaultInlineInNoInline() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/nonDefaultInlineInNoInline.kt");
        }

        @TestMetadata("receiverClash.kt")
        public void testReceiverClash() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClash.kt");
        }

        @TestMetadata("receiverClash2.kt")
        public void testReceiverClash2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClash2.kt");
        }

        @TestMetadata("receiverClashInClass.kt")
        public void testReceiverClashInClass() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClashInClass.kt");
        }

        @TestMetadata("receiverClashInClass2.kt")
        public void testReceiverClashInClass2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClashInClass2.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simple.kt");
        }

        @TestMetadata("simpleErased.kt")
        public void testSimpleErased() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleErased.kt");
        }

        @TestMetadata("simpleErasedStaticInstance.kt")
        public void testSimpleErasedStaticInstance() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleErasedStaticInstance.kt");
        }

        @TestMetadata("simpleExtension.kt")
        public void testSimpleExtension() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleExtension.kt");
        }

        @TestMetadata("simpleGeneric.kt")
        public void testSimpleGeneric() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleGeneric.kt");
        }

        @TestMetadata("simpleStaticInstance.kt")
        public void testSimpleStaticInstance() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleStaticInstance.kt");
        }

        @TestMetadata("thisClash.kt")
        public void testThisClash() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/thisClash.kt");
        }

        @TestMetadata("thisClashInClass.kt")
        public void testThisClashInClass() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/thisClashInClass.kt");
        }

        @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class CallableReferences extends AbstractIrBlackBoxInlineCodegenTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInCallableReferences() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("boundFunctionReference.kt")
            public void testBoundFunctionReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReference.kt");
            }

            @TestMetadata("boundFunctionReferenceOnInt.kt")
            public void testBoundFunctionReferenceOnInt() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReferenceOnInt.kt");
            }

            @TestMetadata("boundFunctionReferenceOnLong.kt")
            public void testBoundFunctionReferenceOnLong() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReferenceOnLong.kt");
            }

            @TestMetadata("boundPropertyReference.kt")
            public void testBoundPropertyReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReference.kt");
            }

            @TestMetadata("boundPropertyReferenceOnInt.kt")
            public void testBoundPropertyReferenceOnInt() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReferenceOnInt.kt");
            }

            @TestMetadata("boundPropertyReferenceOnLong.kt")
            public void testBoundPropertyReferenceOnLong() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReferenceOnLong.kt");
            }

            @TestMetadata("constuctorReference.kt")
            public void testConstuctorReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/constuctorReference.kt");
            }

            @TestMetadata("differentInvokeSignature.kt")
            public void testDifferentInvokeSignature() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/differentInvokeSignature.kt");
            }

            @TestMetadata("differentInvokeSignature2.kt")
            public void testDifferentInvokeSignature2() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/differentInvokeSignature2.kt");
            }

            @TestMetadata("functionImportedFromObject.kt")
            public void testFunctionImportedFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionImportedFromObject.kt");
            }

            @TestMetadata("functionReference.kt")
            public void testFunctionReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReference.kt");
            }

            @TestMetadata("functionReferenceFromClass.kt")
            public void testFunctionReferenceFromClass() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReferenceFromClass.kt");
            }

            @TestMetadata("functionReferenceFromObject.kt")
            public void testFunctionReferenceFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReferenceFromObject.kt");
            }

            @TestMetadata("innerClassConstuctorReference.kt")
            public void testInnerClassConstuctorReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/innerClassConstuctorReference.kt");
            }

            @TestMetadata("mutableBoundPropertyReferenceFromClass.kt")
            public void testMutableBoundPropertyReferenceFromClass() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/mutableBoundPropertyReferenceFromClass.kt");
            }

            @TestMetadata("mutablePropertyReferenceFromClass.kt")
            public void testMutablePropertyReferenceFromClass() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/mutablePropertyReferenceFromClass.kt");
            }

            @TestMetadata("privateFunctionReference.kt")
            public void testPrivateFunctionReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/privateFunctionReference.kt");
            }

            @TestMetadata("privatePropertyReference.kt")
            public void testPrivatePropertyReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/privatePropertyReference.kt");
            }

            @TestMetadata("propertyImportedFromObject.kt")
            public void testPropertyImportedFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyImportedFromObject.kt");
            }

            @TestMetadata("propertyReference.kt")
            public void testPropertyReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReference.kt");
            }

            @TestMetadata("propertyReferenceFromClass.kt")
            public void testPropertyReferenceFromClass() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReferenceFromClass.kt");
            }

            @TestMetadata("propertyReferenceFromObject.kt")
            public void testPropertyReferenceFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReferenceFromObject.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MaskElimination extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        @TestMetadata("32Parameters.kt")
        public void test32Parameters() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/32Parameters.kt");
        }

        @TestMetadata("33Parameters.kt")
        public void test33Parameters() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/33Parameters.kt");
        }

        public void testAllFilesPresentInMaskElimination() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/maskElimination"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("kt18792.kt")
        public void testKt18792() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt18792.kt");
        }

        @TestMetadata("kt19679.kt")
        public void testKt19679() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679.kt");
        }

        @TestMetadata("kt19679_2.kt")
        public void testKt19679_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679_2.kt");
        }

        @TestMetadata("kt19679_3.kt")
        public void testKt19679_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679_3.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/simple.kt");
        }
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/delegatedProperty")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class DelegatedProperty extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInDelegatedProperty() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/delegatedProperty"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("kt16864.kt")
    public void testKt16864() throws Exception {
        runTest("compiler/testData/codegen/boxInline/delegatedProperty/kt16864.kt");
    }

    @TestMetadata("local.kt")
    public void testLocal() throws Exception {
        runTest("compiler/testData/codegen/boxInline/delegatedProperty/local.kt");
    }

    @TestMetadata("localDeclaredInLambda.kt")
    public void testLocalDeclaredInLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/delegatedProperty/localDeclaredInLambda.kt");
    }

    @TestMetadata("localInAnonymousObject.kt")
    public void testLocalInAnonymousObject() throws Exception {
        runTest("compiler/testData/codegen/boxInline/delegatedProperty/localInAnonymousObject.kt");
    }

    @TestMetadata("localInLambda.kt")
    public void testLocalInLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/delegatedProperty/localInLambda.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/enclosingInfo")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class EnclosingInfo extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInEnclosingInfo() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/enclosingInfo"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("anonymousInLambda.kt")
    public void testAnonymousInLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/anonymousInLambda.kt");
    }

    @TestMetadata("inlineChain.kt")
    public void testInlineChain() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/inlineChain.kt");
    }

    @TestMetadata("inlineChain2.kt")
    public void testInlineChain2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/inlineChain2.kt");
    }

    @TestMetadata("objectInInlineFun.kt")
    public void testObjectInInlineFun() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/objectInInlineFun.kt");
    }

    @TestMetadata("transformedConstructor.kt")
    public void testTransformedConstructor() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/transformedConstructor.kt");
    }

    @TestMetadata("transformedConstructorWithAdditionalObject.kt")
    public void testTransformedConstructorWithAdditionalObject() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/transformedConstructorWithAdditionalObject.kt");
    }

    @TestMetadata("transformedConstructorWithNestedInline.kt")
    public void testTransformedConstructorWithNestedInline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enclosingInfo/transformedConstructorWithNestedInline.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/enum")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class Enum extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInEnum() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/enum"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("kt10569.kt")
    public void testKt10569() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/kt10569.kt");
    }

    @TestMetadata("kt18254.kt")
    public void testKt18254() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/kt18254.kt");
    }

    @TestMetadata("valueOf.kt")
    public void testValueOf() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOf.kt");
    }

    @TestMetadata("valueOfCapturedType.kt")
    public void testValueOfCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfCapturedType.kt");
    }

    @TestMetadata("valueOfChain.kt")
    public void testValueOfChain() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfChain.kt");
    }

    @TestMetadata("valueOfChainCapturedType.kt")
    public void testValueOfChainCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfChainCapturedType.kt");
    }

    @TestMetadata("valueOfNonReified.kt")
    public void testValueOfNonReified() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valueOfNonReified.kt");
    }

    @TestMetadata("values.kt")
    public void testValues() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/values.kt");
    }

    @TestMetadata("valuesAsArray.kt")
    public void testValuesAsArray() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesAsArray.kt");
    }

    @TestMetadata("valuesCapturedType.kt")
    public void testValuesCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesCapturedType.kt");
    }

    @TestMetadata("valuesChain.kt")
    public void testValuesChain() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesChain.kt");
    }

    @TestMetadata("valuesChainCapturedType.kt")
    public void testValuesChainCapturedType() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesChainCapturedType.kt");
    }

    @TestMetadata("valuesNonReified.kt")
    public void testValuesNonReified() throws Exception {
        runTest("compiler/testData/codegen/boxInline/enum/valuesNonReified.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/functionExpression")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class FunctionExpression extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInFunctionExpression() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/functionExpression"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("extension.kt")
    public void testExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/functionExpression/extension.kt");
    }
}

@TestMetadata("compiler/testData/codegen/boxInline/inlineClasses")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public static class InlineClasses extends AbstractIrBlackBoxInlineCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInInlineClasses() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/inlineClasses"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("inlineClassWithInlineValReturningInlineClass.kt")
    public void testInlineClassWithInlineValReturningInlineClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/inlineClassWithInlineValReturningInlineClass.kt");
    }

    @TestMetadata("inlineFunctionInsideInlineClassesBox.kt")
    public void testInlineFunctionInsideInlineClassesBox() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/inlineFunctionInsideInlineClassesBox.kt");
    }

    @TestMetadata("noReturnTypeManglingFun.kt")
    public void testNoReturnTypeManglingFun() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/noReturnTypeManglingFun.kt");
    }

    @TestMetadata("noReturnTypeManglingFunJvmName.kt")
    public void testNoReturnTypeManglingFunJvmName() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/noReturnTypeManglingFunJvmName.kt");
    }

    @TestMetadata("noReturnTypeManglingVal.kt")
    public void testNoReturnTypeManglingVal() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/noReturnTypeManglingVal.kt");
    }

    @TestMetadata("withReturnTypeManglingFun.kt")
    public void testWithReturnTypeManglingFun() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/withReturnTypeManglingFun.kt");
    }

    @TestMetadata("withReturnTypeManglingFunJvmName.kt")
    public void testWithReturnTypeManglingFunJvmName() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/withReturnTypeManglingFunJvmName.kt");
    }

    @TestMetadata("withReturnTypeManglingVal.kt")
    public void testWithReturnTypeManglingVal() throws Exception {
        runTest("compiler/testData/codegen/boxInline/inlineClasses/withReturnTypeManglingVal.kt");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnboxGenericParameter extends AbstractIrBlackBoxInlineCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInUnboxGenericParameter() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class FunInterface extends AbstractIrBlackBoxInlineCodegenTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInFunInterface() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("any.kt")
            public void testAny() throws Exception {
                runTest("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface/any.kt");
            }

            @TestMetadata("anyN.kt")
            public void testAnyN() throws Exception {
                runTest("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface/anyN.kt");
            }

            @TestMetadata("iface.kt")
            public void testIface() throws Exception {
                runTest("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface/iface.kt");
            }

            @TestMetadata("ifaceChild.kt")
            public void testIfaceChild() throws Exception {
                runTest("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface/ifaceChild.kt");
            }

            @TestMetadata("primitive.kt")
            public void testPrimitive() throws Exception {
                runTest("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface/primitive.kt");
            }

            @TestMetadata("string.kt")
            public void testString() throws Exception {
                runTest("compiler/testData/codegen/boxInline/inlineClasses/unboxGenericParameter/funInterface/string.kt");
            }
        }

}
