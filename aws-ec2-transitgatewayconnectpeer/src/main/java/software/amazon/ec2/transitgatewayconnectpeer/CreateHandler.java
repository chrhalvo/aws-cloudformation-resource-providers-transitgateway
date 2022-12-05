package software.amazon.ec2.transitgatewayconnectpeer;

import software.amazon.ec2.transitgatewayconnectpeer.workflow.create.Create;
import software.amazon.ec2.transitgatewayconnectpeer.workflow.read.Read;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.cloudformation.proxy.*;

public class CreateHandler extends BaseHandlerStd {

    @Override
    protected ProgressEvent<ResourceModel, CallbackContext> handleRequest(
            final AmazonWebServicesClientProxy proxy,
            final ResourceHandlerRequest<ResourceModel> request,
            final CallbackContext callbackContext,
            final ProxyClient<Ec2Client> proxyClient,
            final Logger logger) {
        return ProgressEvent.progress(request.getDesiredResourceState(), callbackContext)
                .then(new Create(proxy, request, callbackContext, proxyClient, logger)::run)
                .then(new Read(proxy, request, callbackContext, proxyClient, logger)::run);
    }
}
